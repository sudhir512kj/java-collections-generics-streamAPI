package com.sudhirmeena.genericsandcollections.sorting;

public class Book implements Comparable<Book> {
    private String title;
    private String authorName;
    private int numOfPages;

    public Book() {

    }

    public Book(String authorName, String title, int numOfPages) {
        this.authorName = authorName;
        this.title = title;
        this.numOfPages = numOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", numOfPages=" + numOfPages +
                '}';
    }

    @Override
    public int compareTo(Book otherBook) {
        if (this.numOfPages > otherBook.getNumOfPages()) return -1;
        if (this.numOfPages == otherBook.getNumOfPages()) return 0;
        else return 1;
        // return this.authorName.compareTo(otherBook.authorName);
    }
}
