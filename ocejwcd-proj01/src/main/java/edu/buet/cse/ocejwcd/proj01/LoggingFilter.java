package edu.buet.cse.ocejwcd.proj01;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 *
 * @author shamim
 */
@WebFilter(filterName = "LogFilter",
        urlPatterns = "/hello.do",
        initParams = @WebInitParam(name = "active", value = "true"))
public class LoggingFilter implements Filter {

  private FilterConfig filterConfig;

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
    this.filterConfig = filterConfig;
  }

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    boolean active = Boolean.valueOf(filterConfig.getInitParameter("active"));

    if (active) {
      filterConfig.getServletContext().log(String.format("%s has been invoked", filterConfig.getFilterName()));
    }
    
    chain.doFilter(request, response);
  }

  @Override
  public void destroy() {
  }
}
