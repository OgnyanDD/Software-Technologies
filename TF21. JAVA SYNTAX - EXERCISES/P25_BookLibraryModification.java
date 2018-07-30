package P25_BookLibraryModification;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Function;

public class P25_BookLibraryModification {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int totalBooks = Integer.parseInt(in.nextLine());
        ArrayList<Book> booksList = new ArrayList<Book>();

        Map<String, LocalDate> titleDateMap = new LinkedHashMap<>();
        for (int i = 0; i < totalBooks; i++) {
            String[] tokens = in.nextLine().split("\\s+");
            LocalDate date = LocalDate.parse(tokens[3], DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            double price = Double.parseDouble(tokens[5]);
            Book currentBook = new Book(tokens[0], tokens[1], tokens[2], date, tokens[4], price);
            booksList.add(currentBook);
        }

        LocalDate dateForCompare = LocalDate.parse(in.nextLine(), DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        Library currentLibrary = new Library("Prosveta", new ArrayList<Book>(booksList));

        for (Book book : currentLibrary.getBookList()) {
            titleDateMap.put(book.getTitle(), book.getReleaseDate());

        }

        titleDateMap.entrySet()
                .stream()
                .filter(b -> b.getValue().isAfter(dateForCompare))
                .sorted(Comparator.comparing((Function<Map.Entry<String, LocalDate>, LocalDate>) Map.Entry::getValue).thenComparing(Map.Entry::getKey))
                .forEach(a -> System.out.printf("%s -> %s%n", a.getKey(), a.getValue().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))));
    }

    public static class Book {
        private String title;
        private String author;
        private String publisher;
        private LocalDate releaseDate;
        private String isbn;
        private double price;

        public Book(String title, String author, String publisher, LocalDate releaseDate, String isbn, double price) {
            this.title = title;
            this.author = author;
            this.publisher = publisher;
            this.releaseDate = releaseDate;
            this.isbn = isbn;
            this.price = price;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public LocalDate getReleaseDate() {
            return releaseDate;
        }

        public void setReleaseDate(LocalDate releaseDate) {
            this.releaseDate = releaseDate;
        }

        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }

    public static class Library {
        private String name;

        private List<Book> bookList;

        public Library(String name, List<Book> bookList) {
            this.name = name;
            this.bookList = bookList;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Book> getBookList() {
            return bookList;
        }

        public void setBookList(List<Book> bookList) {
            this.bookList = bookList;
        }
    }
}