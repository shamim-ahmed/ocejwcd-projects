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
  public enum ContentType {
    XML() {
      @Override
      public String getPathToResource() {
        return "/WEB-INF/data/forecast.xml";
      }
      
      @Override
      public String toString() {
        return "application/xml";
      }
    }, 
    JSON() {
      @Override
      public String getPathToResource() {
        return "/WEB-INF/data/forecast.json";
      }
      
      @Override
      public String toString() {
        return "application/json";
      }
    },
    Text() {
      @Override
      public String getPathToResource() {
        return "/WEB-INF/data/forecast.txt";
      }
      
      @Override
      public String toString() {
        return "text/plain";
      }
    };
    
    public abstract String getPathToResource();
  }
  
  private final AsyncContext asyncContext;
  private final ServletContext servletContext;
  private final ContentType contentType;
  private boolean invokeComplete = true;

  public WeatherInfoFetcher(AsyncContext asyncContext, ServletContext servletContext) {
    this(asyncContext, servletContext, ContentType.XML);
  }

  public WeatherInfoFetcher(AsyncContext asyncContext, ServletContext servletContext, ContentType contentType) {
    this.asyncContext = Objects.requireNonNull(asyncContext);
    this.servletContext = Objects.requireNonNull(servletContext);
    this.contentType = Objects.requireNonNull(contentType);
  }
  
  public boolean isInvokeComplete() {
    return invokeComplete;
  }

  public void setInvokeComplete(boolean invokeComplete) {
    this.invokeComplete = invokeComplete;
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
    
    if (response != null) {
      response.setContentType(contentType.toString());

      try (PrintWriter out = response.getWriter()) {
        out.write(result);
      } catch (IOException ex) {
        servletContext.log("Error while sending back forecast to the client", ex);
      }

      if (invokeComplete) {
        asyncContext.complete();
      }
    }
  }

  private String getWeatherData() {
    String result = "";
    ByteArrayOutputStream out = new ByteArrayOutputStream();

    try (InputStream in = servletContext.getResourceAsStream(contentType.getPathToResource())) {
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
