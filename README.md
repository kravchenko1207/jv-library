Library Management System
Author: Iryna Kravchenko

Overview
This is a simple Java console application for managing a library of books. It allows you to add books, search by title or author, and display all books in a sorted order.

Project Structure
model — contains classes describing domain entities: Author (as a record) and Book.

service — contains Library class, which manages a collection of books.

util — utility classes like FileUtil for saving books to a file.

Main — the main entry point with a console-based menu for user interaction.

Key Classes Description

public record Author(String name, int birthYear) { }
An immutable record holding the author's name and birth year.

Book
Represents a book with author, title, publication year, and availability status. Supports cloning, equality checks, hashing, and string representation.

toggleAvailability() method flips the availability status.

Library
Manages a collection of books with methods to:

Add a book

Search by title

Search by author

Print all books sorted by title

Recursively print books (not used in main menu)

FileUtil
Utility for saving a list of books to a text file.

Main
Console application with menu options to:

Add a book

Search books by title

Search books by author

Show all books

Exit the program

Features and Concepts Used
Java Record for immutable data class (Author)

Immutability for thread safety and simplicity

Mutable and immutable fields in Book

Cloneable interface implementation for copying books

Override of equals(), hashCode(), and toString() methods for proper comparisons and output

Java Collections (List, Optional) for managing books

Stream API for filtering and sorting

User input handling via Scanner

Recursion example for printing books

File I/O using BufferedWriter

Modular project structure using packages (model, service, util)

How to Run
Compile all Java files.

Run the Main class.

Use the console menu to interact with the library.

Example Usage
Library Menu:
1. Add a book
2. Search by title
3. Search by author
4. Show all books
5. Exit
Choose an option: 2
🔍 Enter book title: Harry Potter
Found: Harry Potter by J.K. Rowling (1997)
Possible Improvements
Persist data between sessions (e.g., save/load from file or database)

Partial/substring search support

Book editing functionality

Robust input validation and error handling
