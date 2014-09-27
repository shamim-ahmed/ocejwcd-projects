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
 * This servlet shows that invocation of AsyncContext.complete() is not <br>
 * absolutely necessary. Even if we don't do it, the request completes successfully.
 * 
 * @author shamim
 */
@WebServlet(asyncSupported = true,
            urlPatterns = "/text-weather-data")
public class TextWeatherDataServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    AsyncContext asyncContext = request.startAsync();
    log("hasOriginalRequestAndResponse = " + asyncContext.hasOriginalRequestAndResponse());
    WeatherInfoFetcher infoFetcher = new WeatherInfoFetcher(asyncContext, getServletContext(), WeatherInfoFetcher.ContentType.Text);
    infoFetcher.setInvokeComplete(false);
    asyncContext.start(infoFetcher);
  }
}
