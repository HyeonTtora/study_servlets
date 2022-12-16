package com.kh.jung.study_servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/helloWorldServlets")
public class HelloWorldServlets extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
<<<<<<< HEAD
=======
       
        String message = "HelloWorldServlets !! with MESSAGE !!";
>>>>>>> e1613880aff3564fc7cbb34af0ba818ba5cce6c0
        PrintWriter printWriter = response.getWriter();
        String messege = "Hello World Servlets with Message! ";
        printWriter.println("<html lang='en'>");
        printWriter.println("<head>");
        printWriter.println("<title>" + messege + "</title>");
        printWriter.println("</head>");
        printWriter.println("<body>");
        printWriter.println("<div>" + messege + "</div>");
        printWriter.println("</body></html>");

        printWriter.close();
    }

}
