package model;

import java.util.Objects;

public class Book implements Cloneable {
    private final Author author;
    private String title;
    private int year;
    private boolean available;

    public Book(Author author, String title, int year, boolean available) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.available = available;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }


    public boolean isAvailable() {
        return available;
    }

    public void toggleAvailability() {
        this.available ^= true;
    }

    @Override
    public Book clone() {
        try {
            return (Book) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book b)) return false;
        return year == b.year && Objects.equals(title, b.title)
                && Objects.equals(author, b.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, year);
    }

    @Override
    public String toString() {
        return title + " by " + author.name() + " (" + year + ")";
    }
}
