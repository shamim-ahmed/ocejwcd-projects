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
    RequestDispatcher dispatcher = null;
    
    switch (tagName) {
      case "myTag":
        dispatcher = request.getRequestDispatcher("/WEB-INF/templates/myTagDemo.jsp");
        break;
      case "myTag2":
        dispatcher = request.getRequestDispatcher("/WEB-INF/templates/myTag2Demo.jsp");
        break;
      case "printBody":
        dispatcher = request.getRequestDispatcher("/WEB-INF/templates/printBodyDemo.jsp");
        break;
      case "movieDetails":
        List<Movie> movies = MovieProvider.getMovies();
        request.setAttribute("movies", movies);
        dispatcher = request.getRequestDispatcher("/WEB-INF/templates/movieDetailsDemo.jsp");
        break;
      default:
        dispatcher = request.getRequestDispatcher("/index.jsp");
        break;
    }
    
    dispatcher.forward(request, response);
  }
}
