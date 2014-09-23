package edu.buet.cse.ocejwcd.proj03.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author shamim
 */
@WebServlet(name = "printServlet", urlPatterns = "/print.do")
public class AttributePrinterServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    response.setContentType("text/plain");
    PrintWriter out = response.getWriter();

    Enumeration<String> attrNames = request.getAttributeNames();

    while (attrNames.hasMoreElements()) {
      String name = attrNames.nextElement();
      Object value = request.getAttribute(name);
      out.printf("%s = %s%n", name, value);
    }

    out.flush();
  }
}
