import model.Author;
import model.Book;
import service.Library;
import util.FileUtil;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        Author rowling = new Author("J.K. Rowling", 1965);
        Author tolkien = new Author("J.R.R. Tolkien", 1892);
        library.addBook(new Book(rowling, "Harry Potter", 1997, true));
        library.addBook(new Book(tolkien, "The Lord of the Rings", 1954, false));

        while (true) {
            System.out.println("\n Library Menu:");
            System.out.println("1. Add a book");
            System.out.println("2. Search by title");
            System.out.println("3. Search by author");
            System.out.println("4. Show all books");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> {
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author name: ");
                    String authorName = scanner.nextLine();
                    System.out.print("Enter publication year: ");
                    int year = Integer.parseInt(scanner.nextLine());
                    System.out.print("Is the book available? (true/false): ");
                    boolean available = Boolean.parseBoolean(scanner.nextLine());
                    Author author = new Author(authorName, 0); // optional: ask for author birth year
                    Book book = new Book(author, title, year, available);
                    library.addBook(book);
                    System.out.println("Book added successfully.");
                }
                case "2" -> {
                    System.out.print("🔍 Enter book title: ");
                    String title = scanner.nextLine();
                    library.findByTitle(title)
                            .ifPresentOrElse(
                                    book -> System.out.println("Found: " + book),
                                    () -> System.out.println("No book found with that title.")
                            );
                }
                case "3" -> {
                    System.out.print("👤 Enter author name: ");
                    String authorName = scanner.nextLine();
                    List<Book> books = library.findByAuthor(authorName);
                    if (books.isEmpty()) {
                        System.out.println("No books found by that author.");
                    } else {
                        System.out.println("Books found:");
                        books.forEach(System.out::println);
                    }
                }
                case "4" -> {
                    System.out.println("📖 All books:");
                    library.printBooksSorted();
                }
                case "5" -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

