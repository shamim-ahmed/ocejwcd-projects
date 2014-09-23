package edu.buet.cse.ocejwcd.proj01;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 *
 * @author shamim
 */
@WebListener
public class CustomServletContextListener implements ServletContextListener {

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    ServletContext context = sce.getServletContext();
    context.log(String.format("The context %s is being initialized", context.getContextPath()));
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {
    ServletContext context = sce.getServletContext();
    context.log(String.format("The context %s is being destroyed", context.getContextPath()));
  } 
}
