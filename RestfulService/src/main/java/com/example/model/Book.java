package com.example.model;

public class Book {

    private String title;
    private int price;
    private String author;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String title, int price, String author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }
}
