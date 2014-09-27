package edu.buet.cse.ocejwcd.proj03.servlet;

import edu.buet.cse.ocejwcd.proj03.util.WeatherInfoFetcher;
import java.io.IOException;
import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * An example of timeout in case of an asynchronous request, which <br>
 * results in an HTTP 500 error
 * 
 * @author shamim
 */
@WebServlet(urlPatterns = "/late-forecast",
            asyncSupported = true)
public class TimeOutServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    AsyncContext asyncContext = request.startAsync();
    asyncContext.setTimeout(5000);
    WeatherInfoFetcher infoFetcher = new WeatherInfoFetcher(asyncContext, getServletContext());
    asyncContext.start(infoFetcher);
  }
}
