using MovieBooking.Models;
using MovieBooking.Repositories;
using System.Xml.Linq;

namespace MovieBooking.Services
{
    public class MovieService : IMovieService
    {
        private readonly IMovieRepository _movieRepository;

        public MovieService(IMovieRepository movieRepository)
        {
            _movieRepository = movieRepository;
        }


        public bool insert(Movie movie)
        {
            return _movieRepository.insert(movie);
        }
        public bool update(Movie movie)
        {
            return _movieRepository.update(movie);
        }
        public bool delete(int id)
        {
            return _movieRepository.delete(id);

        }

        public List<Movie> GetAll()
        {
            return _movieRepository.GetAll();
        }

        public Movie Get(int id)
        {
            return _movieRepository.Get(id);
        }

        public List<Movie> GetByName(string name)
        {
            return _movieRepository.GetByName(name);    
        }
        public List<Movie> sortByPrice()
        {
            return _movieRepository.sortByPrice();
        }
    }
}
