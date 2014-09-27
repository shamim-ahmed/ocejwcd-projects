package edu.buet.cse.ocejwcd.proj04.m1.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * A very basic servlet configured via annotation
 *
 * @author shamim
 */
@WebServlet(name = "helloWorld",
        urlPatterns = "/hello-world")
public class HelloWorldServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    response.setContentType("text/plain");
    
    PrintWriter out = response.getWriter();
    out.println("Hello World !");
    out.flush();
  }
}
