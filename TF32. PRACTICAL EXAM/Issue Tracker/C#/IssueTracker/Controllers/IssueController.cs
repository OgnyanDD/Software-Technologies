namespace IssueTracker.Controllers
{
    using Microsoft.AspNetCore.Mvc;
    using IssueTracker.Models;
    using System.Linq;

    public class IssueController : Controller
    {
        private readonly IssueDbContext context;

        public IssueController(IssueDbContext context)
        {
            this.context = context;
        }

        [HttpGet]
        [Route("")]
        public ActionResult Index()
        {
            var issues = context.Issues.ToList();

            return View(issues);
        }

        [HttpGet]
        [Route("create")]
        public ActionResult Create()
        {
            return View();

        }

        [HttpPost]
        [Route("create")]
        public ActionResult Create(Issue issue)
        {
            context.Issues.Add(issue);
            context.SaveChanges();

            return RedirectToAction(nameof(Index));
        }

        [HttpGet]
        [Route("edit/{id}")]
        public ActionResult Edit(int id)
        {
            var issue = context
                 .Issues
                 .Where(i => i.Id == id)
                 .FirstOrDefault();

            return View(issue);
        }

        [HttpPost]
        [Route("edit/{id}")]
        [ValidateAntiForgeryToken]
        public ActionResult EditConfirm(int id, Issue issueModel)
        {
            context.Issues.Update(issueModel);
            context.SaveChanges();

            return RedirectToAction("Index");

        }

        [HttpGet]
        [Route("delete/{id}")]
        public ActionResult Delete(int id)
        {
            var issue = context
                 .Issues
                 .Where(i => i.Id == id)
                 .FirstOrDefault();

            return View(issue);

        }

        [HttpPost]
        [Route("delete/{id}")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirm(int id, Issue issueModel)
        {
            var issue = context
                 .Issues
                 .Where(i => i.Id == id)
                 .FirstOrDefault();

            context.Remove(issue);
            context.SaveChanges();

            return RedirectToAction("Index");
        }
    }
}
