package com.servlerts;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.model.Book;
import com.service.BookService;
import com.service.InMemoryServiceImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class BookServlet extends HttpServlet {

    private static final Gson GSON=new GsonBuilder().create();
    private  static BookService bookService=new InMemoryServiceImp();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getPathInfo()==null){
            List<Book>books =bookService.getBook();
            resp.setStatus(200);
            resp.setHeader("Context-Type","Application/json");
            resp.getOutputStream().println(GSON.toJson(books));

        }else {
            int BookId =Integer.parseInt(req.getPathInfo().replace("/",""));
            Book book= bookService.getBookId(BookId);
            if(book!=null){
                resp.setStatus(200);
                resp.setHeader("Context-Type","application/json");
                resp.getOutputStream().println(GSON.toJson(book));

            }else {
                resp.setStatus(404);
            }
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      Book book=GSON.fromJson(req.getReader(),Book.class);
      bookService.createBook(book);
      resp.setStatus(201);
      resp.setHeader("Context-Type","application/json");
      resp.getOutputStream().println(GSON.toJson(book));
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int BookId =Integer.parseInt(req.getPathInfo().replace("/",""));
        Book book= bookService.deleteBookByID(BookId);
        resp.setStatus(201);
        resp.setHeader("Context-Type","application/json");
        resp.getOutputStream().println(GSON.toJson(book));

    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Book book=GSON.fromJson(req.getReader(),Book.class);
        bookService.updateBook(book);
        resp.setStatus(201);
        resp.setHeader("Context-Type","application/json");
        resp.getOutputStream().println(GSON.toJson(book));

    }
}
