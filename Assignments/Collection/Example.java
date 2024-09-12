package collection;
import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "\"" + title + "\" by " + author.getName();
    }
}

class Author {
    private String name;
    private List<Book> books;

    public Author(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Example {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Author author1 = new Author("J.K. Rowling");
        Author author2 = new Author("George Orwell");

        Book book1 = new Book("Harry Potter and the Philosopher's Stone", author1);
        Book book2 = new Book("1984", author2);
        Book book3 = new Book("Harry Potter and the Chamber of Secrets", author1);

        author1.addBook(book1);
        author1.addBook(book3);
        author2.addBook(book2);

        printBooks(List.of(book1, book2, book3));
        printAuthors(List.of(author1, author2));
    }
    public static void printBooks(List<Book> books) {
        System.out.println("Books and their Authors:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
    public static void printAuthors(List<Author> authors) {
        System.out.println("\nAuthors and their Books:");
        for (Author author : authors) {
            System.out.println("Author: " + author);
            for (Book book : author.getBooks()) {
                System.out.println("  - " + book);
            }
        }
    }
}
