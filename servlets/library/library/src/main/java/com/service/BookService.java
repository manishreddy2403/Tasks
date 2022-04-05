package com.service;

import com.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getBook();
    Book getBookId(int bookid);
    Book createBook(Book book);
    Book updateBook(Book book);
    Book deleteBookByID(int bookid);
}
