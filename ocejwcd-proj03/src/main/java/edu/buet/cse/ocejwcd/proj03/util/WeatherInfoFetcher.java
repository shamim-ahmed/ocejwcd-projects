package edu.buet.cse.ocejwcd.proj03.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Objects;
import javax.servlet.AsyncContext;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author shamim
 */
public class WeatherInfoFetcher implements Runnable {

  private final AsyncContext asyncContext;
  private final ServletContext servletContext;

  public WeatherInfoFetcher(AsyncContext asyncContext, ServletContext servletContext) {
    this.asyncContext = Objects.requireNonNull(asyncContext);
    this.servletContext = Objects.requireNonNull(servletContext);
  }

  @Override
  public void run() {
    try {
      Thread.sleep(10000);
    } catch (InterruptedException ex) {
      servletContext.log("Interrupted during sleep", ex);
    }

    String result = getWeatherData();
    HttpServletResponse response = (HttpServletResponse) asyncContext.getResponse();
    response.setContentType("application/xml");

    try (PrintWriter out = response.getWriter()) { 
      out.write(result);
    } catch (IOException ex) {
      servletContext.log("Error while sending back forecast to the client", ex);
    }

    asyncContext.complete();
  }

  private String getWeatherData() {
    String result = "";
    ByteArrayOutputStream out = new ByteArrayOutputStream();

    try (InputStream in = servletContext.getResourceAsStream("/WEB-INF/data/forecast.xml")) {
      byte[] buffer = new byte[1024];
      int n;

      while ((n = in.read(buffer)) != -1) {
        out.write(buffer, 0, n);
      }

      result = out.toString("UTF-8");
    } catch (IOException ex) {
      servletContext.log("error while reading forecast", ex);
    }

    return result;
  }
}
