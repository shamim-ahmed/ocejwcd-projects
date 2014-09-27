package edu.buet.cse.ocejwcd.proj04.m1.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * An exotic servlet that extends GenericServlet
 *
 * @author shamim
 */
public class ExoticServlet extends GenericServlet {

  @Override
  public void service(ServletRequest request, ServletResponse response)
          throws ServletException, IOException {
    HttpServletResponse httpResponse = (HttpServletResponse) response;
    httpResponse.setContentType("text/plain");
    PrintWriter out = httpResponse.getWriter();
    out.println("To be or not to be, that is the question.");
    out.flush();
  }
}
