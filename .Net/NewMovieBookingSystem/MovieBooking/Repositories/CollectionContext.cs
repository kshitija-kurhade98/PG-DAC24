using Microsoft.EntityFrameworkCore;
using MovieBooking.Models;

namespace MovieBooking.Repositories
{
    public class CollectionContext: DbContext
    {
        public DbSet<Movie> Movies { get; set; }

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            string conn = @"server=localhost;port=3306;user=root;password=root123;database=MovieBooking";
            optionsBuilder.UseMySQL(conn);
        }

        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            base.OnModelCreating(modelBuilder);
            modelBuilder.Entity<Movie>(entity =>
            {
                entity.HasKey(e => e.id);
                entity.Property(e => e.name).IsRequired();
                entity.Property(e => e.rating).IsRequired();
                entity.Property(e => e.price).IsRequired();
            }
            );

            /*modelBuilder.Entity<Admin>(entity =>
            {
                entity.Property(e => e.username).IsRequired();
                entity.Property(e => e.password).IsRequired();
            }
            );*/

            modelBuilder.Entity<Movie>().ToTable("movies");
           // modelBuilder.Entity<Admin>().ToTable("admin");

        }
    }
}
