using MovieBooking.Models;

namespace MovieBooking.Services
{
    public interface IMovieService
    {
        bool insert(Movie movie);
        bool update(Movie movie);

        bool delete(int id);

        List<Movie> GetAll();
        Movie Get(int id);
        List<Movie> GetByName(string Name);

        List<Movie> sortByPrice();

    }
}
