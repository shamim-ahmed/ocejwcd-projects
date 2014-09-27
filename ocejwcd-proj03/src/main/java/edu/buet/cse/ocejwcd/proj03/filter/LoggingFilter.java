package edu.buet.cse.ocejwcd.proj03.filter;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * A simple filter configured via annotation
 *
 * @author shamim
 */
@WebFilter(filterName = "loggingFilter",
        urlPatterns = "/*",
        asyncSupported = true,
        dispatcherTypes = {DispatcherType.REQUEST, DispatcherType.INCLUDE, DispatcherType.FORWARD, DispatcherType.ERROR, DispatcherType.ASYNC})
public class LoggingFilter implements Filter {
  protected final Logger logger = LogManager.getLogger(getClass());

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
  }

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    HttpServletRequest httpRequest = (HttpServletRequest) request;
    logger.info(String.format("Request URI: %s", httpRequest.getRequestURI()));
    logger.info(String.format("Context path: %s", httpRequest.getContextPath()));
    logger.info(String.format("Servlet path: %s", httpRequest.getServletPath()));
    logger.info(String.format("Path info: %s", httpRequest.getPathInfo()));
    logger.info(String.format("Query string: %s", httpRequest.getQueryString()));
    chain.doFilter(request, response);
  }

  @Override
  public void destroy() {
  }
}
