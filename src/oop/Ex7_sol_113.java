package oop;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

// Book class
class Book {
    private String name;
    private String author;
    private String issuedTo; // student name
    private Date issuedOn;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        this.issuedTo = null;
        this.issuedOn = null;
    }

    public String getName() { return name; }
    public String getAuthor() { return author; }
    public String getIssuedTo() { return issuedTo; }
    public Date getIssuedOn() { return issuedOn; }
    public boolean isIssued() { return issuedTo != null; }

    public void issue(String studentName) {
        this.issuedTo = studentName;
        this.issuedOn = new Date(); // current date
    }

    public void returnBook() {
        this.issuedTo = null;
        this.issuedOn = null;
    }

    @Override
    public String toString() {
        if (isIssued()) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");
            return "Book: " + name + " | Author: " + author +
                    " | Issued To: " + issuedTo + " on " + sdf.format(issuedOn);
        } else {
            return "Book: " + name + " | Author: " + author + " | Available";
        }
    }
}

// Library class
class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<String> students = new ArrayList<>(); // registered students

    public void addStudent(String studentName) {
        if (!students.contains(studentName)) {
            students.add(studentName);
            System.out.println("Student registered successfully!");
        } else {
            System.out.println("Student already registered!");
        }
    }

    public void addBook(String name, String author) {
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(name)) {
                System.out.println("Book already exists!");
                return;
            }
        }
        books.add(new Book(name, author));
        System.out.println("Book added successfully!");
    }

    public void issueBook(String bookName, String studentName) {
        if (!students.contains(studentName)) {
            System.out.println("Student not registered!");
            return;
        }
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(bookName) && !book.isIssued()) {
                book.issue(studentName);
                System.out.println("Book issued to " + studentName);
                return;
            }
        }
        System.out.println("Book not available or already issued!");
    }

    public void returnBook(String bookName) {
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(bookName) && book.isIssued()) {
                book.returnBook();
                System.out.println("Book returned successfully!");
                return;
            }
        }
        System.out.println("Book not found or was not issued!");
    }

    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in library!");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void showAvailableBooks() {
        boolean found = false;
        for (Book book : books) {
            if (!book.isIssued()) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No available books!");
        }
    }
}

// Main class
public class Ex7_sol_113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        // Pre-register some students
        library.addStudent("Abhinav");
        library.addStudent("Shivam");
        library.addStudent("Priya");

        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Show All Books");
            System.out.println("5. Show Available Books");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book name: ");
                    String bookName = sc.nextLine();
                    System.out.print("Enter author name: ");
                    String author = sc.nextLine();
                    library.addBook(bookName, author);
                    break;

                case 2:
                    System.out.print("Enter book name to issue: ");
                    String issueBook = sc.nextLine();
                    System.out.print("Enter student name: ");
                    String studentName = sc.nextLine();
                    library.issueBook(issueBook, studentName);
                    break;

                case 3:
                    System.out.print("Enter book name to return: ");
                    String returnBook = sc.nextLine();
                    library.returnBook(returnBook);
                    break;

                case 4:
                    library.showBooks();
                    break;

                case 5:
                    library.showAvailableBooks();
                    break;

                case 6:
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
