package edu.buet.cse.ocejwcd.proj03.servlet;

import edu.buet.cse.ocejwcd.proj03.util.WeatherInfoFetcher;
import java.io.IOException;
import javax.servlet.AsyncContext;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author shamim
 */
@WebServlet(name = "weatherServlet", 
            urlPatterns="/weather.do",
            asyncSupported = true)
public class WeatherServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    ServletContext servletContext = getServletContext();
    AsyncContext asyncContext = request.startAsync();
    
    servletContext.log("doGet() method begins");
    WeatherInfoFetcher fetcher = new WeatherInfoFetcher(asyncContext, servletContext);
    asyncContext.start(fetcher);
    servletContext.log("doGet() method ends");
  }
}
