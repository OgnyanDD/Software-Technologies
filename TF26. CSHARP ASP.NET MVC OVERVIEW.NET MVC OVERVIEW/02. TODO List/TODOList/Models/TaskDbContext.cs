using Microsoft.EntityFrameworkCore;

namespace TODOList.Models
{
    public class TaskDbContext : DbContext
    {
        public DbSet<Task> Tasks { get; set; }

        public TaskDbContext()
        {
            this.Database.EnsureCreated();
        }

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            optionsBuilder.UseMySQL("server=localhost;database=todo_list;user=root;SslMode=none");
        }
    }
}
