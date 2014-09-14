package edu.buet.cse.ocejwcd.proj02.servlet;

import edu.buet.cse.ocejwcd.proj02.util.MovieProvider;
import edu.buet.cse.ocejwcd.proj02.model.Movie;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * A servlet that adds a list of movies to request scope
 *
 * @author shamim
 */
@WebServlet(name = "movieServlet", urlPatterns = "/movies.do")
public class MovieServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    List<Movie> movies = MovieProvider.getMovies();
    request.setAttribute("movies", movies);
    
    RequestDispatcher dispatcher = request.getRequestDispatcher("/result.jsp");
    dispatcher.forward(request, response);
  }
}
