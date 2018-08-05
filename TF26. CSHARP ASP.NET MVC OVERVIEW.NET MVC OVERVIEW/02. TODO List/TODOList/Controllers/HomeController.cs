using System.Linq;
using Microsoft.AspNetCore.Mvc;
using TODOList.Models;

namespace TODOList.Controllers
{
    public class HomeController : Controller
    {
        public IActionResult Index()
        {
            using (var db = new TaskDbContext())
            {
                var tasks = db.Tasks.ToList();

                return View(tasks);
            }
        }
    }
}
