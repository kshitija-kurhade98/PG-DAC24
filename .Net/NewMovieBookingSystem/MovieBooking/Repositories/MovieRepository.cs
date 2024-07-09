using MovieBooking.Models;

namespace MovieBooking.Repositories
{
    public class MovieRepository : IMovieRepository
    {
        public bool insert(Movie movie)
        {
            using (var context = new CollectionContext())
            {
                context.Movies.Add(movie);
                context.SaveChanges();

            }
            return true;
        }

        public bool update(Movie movie) 
        {
            using (var context = new CollectionContext())
            {
                var newMovie = context.Movies.Find(movie.id);
                if (newMovie != null)
                {
                    newMovie.name = movie.name;
                    newMovie.rating = movie.rating;
                    newMovie.price = movie.price;
                }
                context.SaveChanges();
                return true;
            }
        }

        public bool delete(int id)
        {
            using (var context = new CollectionContext())
            {
                context.Movies.Remove(context.Movies.Find(id));
                context.SaveChanges();
                return true;
            }
        }

        public List<Movie> GetAll()
        {
            using (var context = new CollectionContext())
            {
                var movies = from m in context.Movies select m;
                return movies.ToList<Movie>();
            }
        }

        public Movie Get(int id)
        {
            using (var context = new CollectionContext())
            {
                var movie = context.Movies.Find(id);
                return movie;
            }
        }

        public List<Movie> GetByName(string name)
        {
            using(var context = new CollectionContext())
            {
                return context.Movies.Where(m => m.name == name).ToList();

            }
        }

        public List<Movie> sortByPrice()
        {
            using (var context = new CollectionContext())
            {
                return context.Movies.OrderBy(m => m.price).ToList();
            }
        }


    }
}
