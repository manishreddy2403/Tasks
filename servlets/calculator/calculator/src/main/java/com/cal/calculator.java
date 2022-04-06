package com.cal;



import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class calculator  extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        PrintWriter pw = resp.getWriter();
        pw.println("Answer ");

        int a = Integer.parseInt(req.getParameter("value1"));
        int b = Integer.parseInt(req.getParameter("value2"));
        String s = req.getParameter("operation");
        if (s.equals("add")) {
            pw.print("addition of value=");
            pw.print(a + b);

        } else if (s.equals("sub")) {
            pw.print("subraction of value");
            pw.print(a - b);

        } else if (s.equals("mul")) {
            pw.print("Multipication of value");
            pw.print(a * b);

        } else if (s.equals("div")) {
            pw.print("divition of value");
            pw.print(a / b);

        }




    }

}

