# Library Management System

**Author:** Iryna Kravchenko

---

## Overview

This is a simple Java console application for managing a collection of books in a library.  
It supports adding books, searching by title or author, displaying all books, and tracking book availability.

---

## Features

- Add a new book with details: author, title, year, availability  
- Search for a book by its title  
- Search for books by author name  
- Display all books sorted alphabetically  
- Toggle availability status of books (internal functionality)  
- Save books list to a file (utility class provided)  

---

## Technologies and Concepts Used

- Java 17+  
- Java Records (immutable `Author` class)  
- Object cloning (`Cloneable` interface)  
- Java Stream API for filtering and sorting collections  
- Optional for safe null handling  
- Recursion for printing books  
- File I/O using `BufferedWriter`  
- Modular project structure with packages (`model`, `service`, `util`)  

---

## Project Structure

- **model** — contains `Author` record and `Book` class representing core entities  
- **service** — contains `Library` class managing a collection of books  
- **util** — contains utility classes like `FileUtil` for file operations  
- **Main** — entry point with console menu interface  

---

## How to Run
Clone the repository:
git clone https://github.com/kravchenko1207/jv-library.git
   
Build the project using your preferred IDE or command line tools.

Run the Main class.

Follow the console menu prompts to manage books.

Usage Example

Library Menu:
1. Add a book
2. Search by title
3. Search by author
4. Show all books
5. Exit
Choose an option: 1
Enter book title: Harry Potter
Enter author name: J.K. Rowling
Enter publication year: 1997
Is the book available? (true/false): true
Book added successfully.
