# Lab 2 - Library Book Management System
> SE 1108 Programming and Problem Solving II

---

## 🎯 Objective
This project implements a simple Library Book Management System using Java classes and ArrayList. The goal is to practice object-oriented programming concepts such as **class design, object interaction, constructors, and dynamic data management using ArrayList**.

---

## 📌 Requirements (Based on Assignment)

### Book Class
The `Book` class includes:
- `String title`
- `String author`
- `int isbn`
- `boolean isAvailable`

#### Implemented Methods:
- Constructor: initializes all attributes
- Getters and setters for all attributes
- `borrowBook()`: marks the book as borrowed
- `returnBook()`: marks the book as available
- `toString()`: returns formatted book details

---

### Library Class
The `Library` class includes:
- `ArrayList<Book> books`

#### Implemented Methods:
- Constructor: initializes the book list
- `addBook(Book book)`: adds a new book to the library
- `borrowBook(int isbn)`: borrows a book if available
- `returnBook(int isbn)`: returns a borrowed book
- `listAvailableBooks()`: displays only available books
- `removeBook(int isbn)`: removes a book by ISBN

---

## 🧪 Program Flow
Inside `Test.main()`:
- At least 3 `Book` objects are created
- A `Library` object is created
- Books are added to the library
- A book is borrowed
- Available books are displayed
- Attempt is made to borrow the same book again
- The book is returned
- Available books are displayed again
- A book is removed from the library

---

## 📂 Project Structure
- `Book.java` → Book model class
- `Library.java` → Library management logic
- `Test.java` → Test and execution class

---

## 📘 Note
This implementation follows the exact requirements given in the Lab 2 specification provided by SE 1108.