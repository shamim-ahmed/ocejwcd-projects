package edu.buet.cse.ocejwcd.proj03.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author shamim
 */
@WebServlet(name = "delegator", urlPatterns = "/delegate.do")
public class DelegatorServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    String useName = request.getParameter("useName");
    RequestDispatcher dispatcher = null;

    if (StringUtils.isNotBlank(useName) && useName.equalsIgnoreCase("true")) {
      dispatcher = getServletContext().getNamedDispatcher("printServlet");
    } else {
      dispatcher = getServletContext().getRequestDispatcher("/print.do");
    }

    dispatcher.forward(request, response);
  }
}
