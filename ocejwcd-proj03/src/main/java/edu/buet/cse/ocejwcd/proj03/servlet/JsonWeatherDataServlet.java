package edu.buet.cse.ocejwcd.proj03.servlet;

import edu.buet.cse.ocejwcd.proj03.listener.CustomAsyncListener;
import edu.buet.cse.ocejwcd.proj03.util.WeatherInfoFetcher;
import java.io.IOException;
import javax.servlet.AsyncContext;
import javax.servlet.AsyncListener;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Returns Json weather forecast data
 * @author shamim
 */
@WebServlet(name = "jsonWeatherData",
    urlPatterns = "/json-weather-data",
    asyncSupported = true)
public class JsonWeatherDataServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
  throws ServletException, IOException {
    AsyncContext asyncContext = request.startAsync();
    AsyncListener listener = asyncContext.createListener(CustomAsyncListener.class);
    asyncContext.addListener(listener);
    
    WeatherInfoFetcher infoFetcher = new WeatherInfoFetcher(asyncContext, getServletContext(), WeatherInfoFetcher.ContentType.JSON);
    asyncContext.start(infoFetcher);
  }
}
