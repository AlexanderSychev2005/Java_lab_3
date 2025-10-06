package org.example.model;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private int yearPublished;
    private int numberOfPages;
    private double price;

    public Book(String title, String author, String publisher, int yearPublished, int numberOfPages, double price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearPublished = yearPublished;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    public String getAuthor() {return author;}
    public String getPublisher() {return publisher;}
    public int getYearPublished() {return yearPublished;}
    public int getNumberOfPages() {return numberOfPages;}
    public double getPrice() {return price;}

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", yearPublished=" + yearPublished +
                ", numberOfPages=" + numberOfPages +
                ", price=" + price +
                '}';
    }
}
