package edu.buet.cse.ocejwcd.proj04.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * A simple context listener implementation
 *
 * @author shamim
 */
@WebListener
public class CustomServletContextListener implements ServletContextListener {

  protected final Logger logger = LogManager.getLogger(getClass());

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    logger.info(String.format("Context %s has been initialized", sce.getServletContext().getContextPath()));
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {
    logger.info(String.format("Context %s has been destroyed", sce.getServletContext().getContextPath()));
  }
}
