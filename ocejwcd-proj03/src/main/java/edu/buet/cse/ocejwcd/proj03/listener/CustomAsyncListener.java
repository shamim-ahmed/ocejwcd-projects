package edu.buet.cse.ocejwcd.proj03.listener;

import java.io.IOException;
import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * A listener for asynchronous events
 * 
 * @author shamim
 */
public class CustomAsyncListener implements AsyncListener {
  protected final Logger logger = LogManager.getLogger(getClass());
  
  @Override
  public void onStartAsync(AsyncEvent event) throws IOException {
    logger.info("Async request started");
  } 
  
  @Override
  public void onComplete(AsyncEvent event) throws IOException {
    logger.info("Async request completed");
    logger.info("Supplied request: " + event.getSuppliedRequest());
    logger.info("Supplied response: " + event.getSuppliedResponse());
  }

  @Override
  public void onTimeout(AsyncEvent event) throws IOException {
    logger.info("Async request timed out");
  }

  @Override
  public void onError(AsyncEvent event) throws IOException {
    Throwable t = event.getThrowable();
    logger.error("An error occurred while handling the asynchronous request", t);
  }
}
