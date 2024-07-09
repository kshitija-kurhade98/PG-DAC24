using Microsoft.AspNetCore.Mvc;
using MovieBooking.Models;
using MovieBooking.Services;
using static Org.BouncyCastle.Crypto.Engines.SM2Engine;

namespace MovieBooking.Controllers
{
    public class CrudController : Controller
    {
        private IMovieService _movieService;

        public CrudController(IMovieService movieService)
        {
            _movieService = movieService;
        }
        public IActionResult Index()
        {
            return View();
        }

        public IActionResult insert()
        {
            return View();
        }

        [HttpPost]
        public IActionResult insert(int id, string name, int rating, int price)
        {
            Movie movie = new Movie();
            movie.id = id;
            movie.name = name;
            movie.rating = rating;
            movie.price = price;

            return Json(_movieService.insert(movie));
        }

        public IActionResult update()
        {
            return View();
        }

        [HttpPost]
        public IActionResult update(int id, string name, int rating, int price)
        {
            Movie newMovie = new Movie();
            newMovie.id = id;
            newMovie.name = name;
            newMovie.rating = rating;
            newMovie.price = price;

            return Json(_movieService.update(newMovie));
        }

        public IActionResult delete() { 
            return View();
        }

        [HttpPost]
        public IActionResult delete(int id)
        {
            return Json(_movieService.delete(id));
        }

        /*public IActionResult getAll()
        {
            return Json(_movieService.GetAll());
        }*/

        public IActionResult getAll()
        {
            List<Movie> movies = _movieService.GetAll();
            return View(movies);
        }

        public IActionResult get()
        {
            return View();
        }

        [HttpPost]
        public IActionResult get(int id) {
            return Json(_movieService.Get(id));
        }

        public IActionResult getByName()
        {
            return View();
        }

        [HttpPost]
        public IActionResult getByName(string name)
        {
            Movie m = new Movie();
            m.name = name;
            return Json(_movieService.GetByName(m.name));
        }

        public IActionResult sortByPrice()
        {
            List<Movie> movie = _movieService.sortByPrice();
            return View(movie);
        }
    }
}
