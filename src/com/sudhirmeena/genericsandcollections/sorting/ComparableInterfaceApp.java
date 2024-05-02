package com.sudhirmeena.genericsandcollections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableInterfaceApp {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("Albert Camus", "title1", 223));
        books.add(new Book("Heidegger", "Being and time", 891));
        books.add(new Book("Michio Kaku", "Quantum Physics", 34));

        Collections.sort(books);

        System.out.println(books);
    }
}
