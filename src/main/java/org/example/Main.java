package org.example;
import org.example.model.Book;
import org.example.view.BookView;
import org.example.controller.BookController;


import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Eugene Onegin", "Alexander Pushkin", "Penguin Classics", 1833, 224, 10.99),
                new Book("War and Peace", "Leo Tolstoy", "Vintage Classics", 1869, 1392, 12.99),
                new Book("1984", "George Orwell", "Harcourt, Brace & Company", 1949, 328, 9.99),
                new Book("Nutcracker", "E.T.A. Hoffmann", "Penguin Classics", 1816, 96, 8.99),
                new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", "Bloomsbury", 1997, 223, 7.99),
                new Book("Harry Potter and the Chamber of Secrets", "J.K. Rowling", "Bloomsbury", 1998, 251, 7.99),
                new Book("Nazi Billionaires", "David de Jong", "HarperCollins", 2024, 400, 15.99)
        );

        BookView bookView = new BookView();
        BookController controller = new BookController(books, bookView);

        System.out.println("Welcome to the Book Management System");
        System.out.println("Books available:");
        bookView.printBooks(books);

        controller.ShowMenu();
    }

}