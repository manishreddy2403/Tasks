package com.service;

import com.model.Book;

import java.util.ArrayList;
import java.util.List;

public class InMemoryServiceImp implements BookService {
    List<Book> bookList=new ArrayList<>();


    @Override
    public List<Book> getBook() {
    return bookList;


    }

    @Override
    public Book getBookId(int bookid) {
        for (int i=0;i<bookList.size();i++){
            if(bookList.get(i).getBookId()==bookid){
                return bookList.get(i);
            }
        }
        return null;

    }

    @Override
    public Book createBook(Book book) {
        bookList.add(book);
        return book;
    }

    @Override
    public Book updateBook(Book book) {
        int z=book.getBookId();
        for (Book i:bookList){
            if(i.getBookId()==z){
                i.setName(book.getName());
                i.setAuthor(book.getAuthor());
            }
        }
return null;
    }

    @Override
    public Book deleteBookByID(int bookid) {
        Book val=null;
        for (int j=0;j<bookList.size();j++){
            if(bookList.get(j).getBookId()==bookid){
                bookList.remove(j);
                val=bookList.get(j);
            }


            }

        return(val);
    }
}
