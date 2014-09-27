package edu.buet.cse.ocejwcd.proj04.m1.servlet;

import edu.buet.cse.ocejwcd.proj04.m2.util.WeatherStation;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * A servlet that returns weather forecast
 * 
 * @author shamim
 */
@WebServlet("/weather-forecast")
public class WeatherForecastServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    String forecast = WeatherStation.getInstance().getForecast();

    response.setContentType("application/xml");
    PrintWriter out = response.getWriter();
    out.println(forecast);
    out.flush();
  }
}
