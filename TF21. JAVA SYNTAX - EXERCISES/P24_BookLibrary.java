package P24_BookLibrary;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.TreeMap;

public class P24_BookLibrary {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int totalBooks = Integer.parseInt(in.nextLine());
        TreeMap<String, Double> data = new TreeMap<>();

        for (int i = 0; i < totalBooks; i++) {
            String[] parts = in.nextLine().split(" ");

            Book book = new Book(
                    parts[0],
                    parts[1],
                    parts[2],
                    LocalDate.parse(parts[3], DateTimeFormatter.ofPattern("dd.MM.yyyy")),
                    parts[4],
                    Double.parseDouble(parts[5])
            );

            if (!data.containsKey(book.getAuthor())) {
                data.put(book.getAuthor(), 0.0);
            }

            double currentPriceSum = data.get(book.getAuthor());
            currentPriceSum += book.getPrise();
            data.put(book.getAuthor(), currentPriceSum);
        }

        data
                .entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    int priceCompair = e2.getValue().compareTo(e1.getValue());
                    if (priceCompair == 0) {
                        return e1.getKey().compareTo(e2.getKey());
                    }
                    return priceCompair;
                })
                .forEach(e -> System.out.printf("%s -> %.2f%n", e.getKey(), e.getValue()));
    }
}

class Book {
    private String title;
    private String author;
    private String publisher;
    private LocalDate releaseDate;
    private String isbn;
    private double prise;

    public Book(String title, String author, String publisher, LocalDate releaseDate, String isbn, double prise) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.releaseDate = releaseDate;
        this.isbn = isbn;
        this.prise = prise;
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

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }
}