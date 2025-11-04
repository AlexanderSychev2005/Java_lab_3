package org.example.controller;

import org.example.model.Book;
import org.example.view.BookView;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BookController {
    private final List<Book> books;
    private final BookView view;

    public BookController(List<Book> books, BookView view) {
        this.books = books;
        this.view = view;
    }

    public void ShowMenu() {
        Scanner sc = new Scanner(System.in);
        int userChoice;
        do {
            view.ShowMenu();
            while(!sc.hasNextInt()) {
                System.out.println("Please enter a valid number:");
                sc.next();
            }
            userChoice = sc.nextInt();
            switch (userChoice) {
                case 1 -> {
                    sc.nextLine(); // consume the newline
                    System.out.println("Please enter the author: ");
                    String author = sc.nextLine();
                    view.printBooks(findBooksByAuthor(author));
                }
                case 2 -> {
                    sc.nextLine(); // consume the newline
                    System.out.println("Please enter the publisher: ");
                    String publisher = sc.nextLine();
                    view.printBooks(findBooksByPublisher(publisher));
                }
                case 3 -> {
                    sc.nextLine(); // consume the newline
                    System.out.println("Please enter the year: ");
                    int year = sc.nextInt();
                    view.printBooks(findBooksAfterYear(year));
                }
                case 4 -> {
                    books.sort(Comparator.comparing(Book::getPublisher));
                    view.printBooks(books);
                }
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Please try again.");
            }

        } while (userChoice !=5);
    }

    private List<Book> findBooksByAuthor(String author) {
        return books.stream().filter(book -> book.getAuthor().equalsIgnoreCase(author)).toList();
    }

    private List<Book> findBooksByPublisher(String publisher) {
        return books.stream().filter(book -> book.getPublisher().equalsIgnoreCase(publisher)).toList();
    }

    private List<Book> findBooksAfterYear(int year) {
        return books.stream().filter(book -> book.getYearPublished() > year).toList();
    }
}
