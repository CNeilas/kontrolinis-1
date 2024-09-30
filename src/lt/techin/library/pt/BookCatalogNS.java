package lt.techin.library.pt;

import java.util.*;
import java.util.function.Predicate;

public class BookCatalogNS implements BookCatalog {

    HashSet<Book> catalog = new HashSet<>();

    @Override
    public void addBook(Book book) {
        catalog.add(book);
    }

    @Override
    public int getTotalNumberOfBooks() {
        return catalog.size();
    }

    @Override
    public void printBookTitles() {
        for (Book book : catalog) {
            System.out.println(book.getTitle());
        }
    }

    @Override
    public void printTitlesOfBooksPublishedAfter(int i) {
        for (Book book : catalog) {
            if (book.getPublicationYear() > i) {
                System.out.println(book.getTitle());
            }
        }
    }

    @Override
    public Book getBookByIsbn(String s) {
        Book isbnBook = new Book();
        for (Book book: catalog) {
            if (Objects.equals(book.getIsbn(), s)) {
                isbnBook = book;
            }
        }
        return isbnBook;
    }

    @Override
    public List<Book> searchBooksByAuthor(String s) {
        List<Book> books = new ArrayList<>();
        for (Book book : catalog) {
            if (Objects.equals(book.getAuthor(), s)) {
                books.add(book);
            }
        }
        return books;
    }

    @Override
    public boolean isBookInCatalog(String s) {
        for (Book book : catalog) {
            if (Objects.equals(book.getTitle(), s)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isBookAvailable(String s) {
        for (Book book: catalog) {
            if (book.isAvailable()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public double calculateTotalPrice() {
        double sum = 0;
        for (Book book : catalog) {
            sum += book.getPrice();
        }

        return sum;

    }

    @Override
    public double calculateAveragePrice() {
        double sum = 0;
        for (Book book : catalog) {
            sum += book.getPrice();
        }
        return sum / catalog.size();
    }

    @Override
    public List<Book> getSortedBooks() {
        return List.of();
    }

    @Override
    public List<Book> searchBooksByTitleContaining(String s) {
        return null;
    }

    @Override
    public Book findNewestBookByPublisher(String s) {
        return null;
    }

    @Override
    public List<Book> filterBooks(Predicate<Book> predicate) {
        return List.of();
    }

    @Override
    public Map<String, List<Book>> groupBooksByPublisher() {
        return Map.of();
    }
}
