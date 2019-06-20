package com.anatol.stream;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Book[] books1 = new Book[3];
        Book[] books2 = new Book[3];

        books1[0] = new Book("Sherlock Holmes", 425, 31.99);
        books1[1] = new Book("Spring MVC", 821, 83);
        books1[2] = new Book("Foodstuffs", 45, 15.12);

        books2[0] = new Book("Harry Potter", 505, 21.23);
        books2[1] = new Book("Learn SQL", 399, 75.02);
        books2[2] = new Book("Sherlock Holmes", 425, 31.99);

        Book[] both = Stream.concat( Stream.of(books1), Stream.of(books2) ).toArray(b -> new Book[b]);
        for (Book c : both)
            System.out.println(c.getName() + ", " + c.getPages() + ", " + c.getPrice());

    }
}
