package edu.buet.cse.ocejwcd.proj04.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * A simple implementation of servlet request listener
 *
 * @author shamim
 */
public class CustomServletRequestListener implements ServletRequestListener {

  protected final Logger logger = LogManager.getLogger(getClass());

  @Override
  public void requestInitialized(ServletRequestEvent event) {
    HttpServletRequest request = (HttpServletRequest) event.getServletRequest();
    logger.info(String.format("request for path %s created", request.getRequestURI()));
  }

  @Override
  public void requestDestroyed(ServletRequestEvent event) {
    HttpServletRequest request = (HttpServletRequest) event.getServletRequest();
    logger.info(String.format("request for path %s destroyed", request.getRequestURI()));
  }
}
