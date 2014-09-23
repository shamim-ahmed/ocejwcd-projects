package edu.buet.cse.ocejwcd.proj01;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author shamim
 */
@WebServlet(name = "displayPhoto", urlPatterns="/displayPhoto.do")
public class DisplayPhotoServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    log(String.format("Servlet %s begins execution", getServletName()));
    RequestDispatcher dispatcher = getServletContext().getNamedDispatcher("imageReader");
    dispatcher.forward(request, response);
    log(String.format("Servlet %s ends execution", getServletName()));
  }
}
