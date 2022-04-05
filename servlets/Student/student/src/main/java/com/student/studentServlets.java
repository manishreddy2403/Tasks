package com.student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class studentServlets extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);

        data d=new data();

        PrintWriter pw=resp.getWriter();
        pw.println(d.getStudentDetails());
        pw.println( d.getStudentDetailsById(101));
        pw.println("second list");
        pw.println( d.getStudentDetailsById(103));
        pw.println(d.deleteStudentDetails(102));
        pw.close();
    }
}
