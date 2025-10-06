package org.example.view;
import org.example.model.Book;
import java.util.List;

public class BookView {
    public void printBooks(List<Book> books) {
        if (books.isEmpty()) {
            System.out.println("Nothing found ");
        } else {
            books.forEach(System.out::println); // method reference books.forEach(x -> System.out.println(x));

        }
    }

    public void ShowMenu() {
        System.out.println("Welcome to Book View");
        System.out.println("1. Find books by author");
        System.out.println("2. Find books by publisher");
        System.out.println("3. Find books published after a certain year");
        System.out.println("4. Sort books by publisher");
        System.out.println("5. Exit");
        System.out.print("Please enter your choice: ");
    }
}
