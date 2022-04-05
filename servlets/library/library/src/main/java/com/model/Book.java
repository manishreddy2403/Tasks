package com.model;

public class Book {
    int bookId;
    String name;
    String  Author;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book=" + bookId +
                ", name='" + name + '\'' +
                ", Author='" + Author + '\'' +
                '}';
    }
}
