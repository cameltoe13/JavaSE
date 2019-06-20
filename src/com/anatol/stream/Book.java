package com.anatol.stream;

public class Book {

    private String name;
    private int pages;
    private double price;

    public Book(String name, int pages, double price) {
        this.name = name;
        this.pages = pages;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }

    public double getPrice() {
        return price;
    }
}
