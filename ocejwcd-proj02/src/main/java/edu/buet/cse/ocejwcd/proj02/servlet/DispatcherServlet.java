package edu.buet.cse.ocejwcd.proj02.servlet;

import edu.buet.cse.ocejwcd.proj02.model.Movie;
import edu.buet.cse.ocejwcd.proj02.util.MovieProvider;
import java.io.IOException;
import java.util.List;
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
@WebServlet(name="dispatcher", urlPatterns="/dispatcher.do")
public class DispatcherServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) 
  throws ServletException, IOException {
    String tagName = request.getParameter("tagName");
    String jspName = getJspName(tagName);
    RequestDispatcher dispatcher = null;
    
    switch (tagName) {
      case "myTag":
      case "myTag2":
      case "printBody":
      case "toUpperCase":
      case "myParentTag":
      case "skipPageTag":
        dispatcher = request.getRequestDispatcher(jspName);
        break;  
      case "movieDetails":
        List<Movie> movies = MovieProvider.getMovies();
        request.setAttribute("movies", movies);
        dispatcher = request.getRequestDispatcher(jspName);
        break;
      default:
        dispatcher = request.getRequestDispatcher("/index.jsp");
        break;
    }
    
    dispatcher.forward(request, response);
  }
  
  private String getJspName(String tagName) {
    return String.format("/WEB-INF/templates/%sDemo.jsp", tagName);
  }
}
