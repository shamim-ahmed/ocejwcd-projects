package edu.buet.cse.ocejwcd.proj04.m2.util;

import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * A utility class that returns weather forecast data
 * 
 * @author shamim
 */
public class WeatherStation {
  private static final WeatherStation INSTANCE = new WeatherStation();
  
  private final Logger logger = LogManager.getLogger(getClass());
 
  public static WeatherStation getInstance() {
    return INSTANCE;
  }
  
  public String getForecast() {
    StringBuilder result = new StringBuilder();
    
    try (InputStream in = getClass().getResourceAsStream("/edu/buet/cse/data/forecast.xml")) {
      byte[] buffer = new byte[1024];
      int n;
      
      while ((n = in.read(buffer)) != -1) {
        result.append(new String(buffer, 0, n));
      }
    } catch (IOException ex) {
      logger.error("An error occurred while reading forecast", ex);
    }
    
    return result.toString();
  }
  // private constructor to prevent instantiation
  private WeatherStation() {
  }
}
