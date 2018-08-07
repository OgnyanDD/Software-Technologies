using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Threading.Tasks;

namespace Blog.Models
{
    public class Article
    {
        public Article()
        {
            this.AddedDate = DateTime.Now;
        }

        [Key]
        public int Id { get; set; }

        [Required]
        [MaxLength(50)]
        public string Title { get; set; }

        [Required]
        [Column(TypeName = "text")]
        public string Content { get; set; }

        public DateTime AddedDate { get; set; }

        [ForeignKey("Author")]
        public string AuthorId { get; set; }

        public virtual ApplicationUser Author { get; set; }

        [NotMapped]
        public string Summary {
            get
            {
                string summary = this.Content.Substring(0, this.Content.Length / 2) + "...";

                return summary;
            } }

        public bool IsAuthor(string name)
        {
            return this.Author.UserName.Equals(name);
        }
    }
}
