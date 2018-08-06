namespace IMDB.Controllers
{
    using Microsoft.AspNetCore.Mvc;
    using System.Linq;
    using Models;

    public class FilmController : Controller
    {
        private readonly IMDBDbContext dbContext;

        public FilmController(IMDBDbContext dbContext)
        {
            this.dbContext = dbContext;
        }

        [HttpGet]
        [Route("")]
        public IActionResult Index()
        {
            var films = dbContext.Films.ToList();

            return View(films);
        }

        [HttpGet]
        [Route("/create")]
        public IActionResult Create()
        {
            return View();
        }

        [HttpPost]
        [Route("/create")]
        public IActionResult Create(Film film)
        {
            dbContext.Films.Add(film);
            dbContext.SaveChanges();

            return RedirectToAction(nameof(Index));
        }

        [HttpGet]
        [Route("/edit/{id}")]
        public IActionResult Edit(int? id)
        {
            var movie = dbContext
                 .Films
                 .Where(m => m.Id == id)
                 .FirstOrDefault();

            return View(movie);
        }

        [HttpPost]
        [Route("/edit/{id}")]
        public IActionResult EditConfirm(int id, Film film)
        {
            var movie = dbContext.Films
                .Where(m => m.Id == id)
                .FirstOrDefault();

            movie.Name = film.Name;
            movie.Genre = film.Genre;
            movie.Director = film.Director;
            movie.Year = film.Year;

            dbContext.Update(movie);
            dbContext.SaveChanges();

            return RedirectToAction("Index");
        }

        [HttpGet]
        [Route("/delete/{id}")]
        public IActionResult Delete(int? id)
        {
            var movie = dbContext
                 .Films
                 .Where(m => m.Id == id)
                 .FirstOrDefault();

            return View(movie);
        }

        [HttpPost]
        [Route("/delete/{id}")]
        public IActionResult Delete(int id, Film film)
        {
            var movie = dbContext.Films
                 .Where(m => m.Id == id)
                 .FirstOrDefault();

            dbContext.Films.Remove(movie);
            dbContext.SaveChanges();

            return RedirectToAction("Index");
        }
    }
}