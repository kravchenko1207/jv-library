package service;

import model.Book;

import java.util.*;
import java.util.stream.Collectors;

public class Library {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book b) {
        books.add(b);
    }

    public Optional<Book> findByTitle(String title) {
        return books.stream()
                .filter(b -> b.getTitle().equalsIgnoreCase(title))
                .findFirst();
    }

    public List<Book> findByAuthor(String authorName) {
        return books.stream()
                .filter(b -> b.getAuthor().name().equalsIgnoreCase(authorName))
                .collect(Collectors.toList());
    }

    public void printBooksSorted() {
        books.stream()
                .sorted(Comparator.comparing(Objects::toString))
                .forEach(System.out::println);
    }

    public void recursivePrint(int i) {
        if (i >= books.size()) return;
        System.out.println(books.get(i));
        recursivePrint(i + 1);
    }
}

