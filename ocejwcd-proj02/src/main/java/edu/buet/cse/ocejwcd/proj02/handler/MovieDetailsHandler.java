package edu.buet.cse.ocejwcd.proj02.handler;

import edu.buet.cse.ocejwcd.proj02.model.Movie;
import java.io.IOException;
import java.util.List;
import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author shamim
 */
public class MovieDetailsHandler extends SimpleTagSupport {
  private String var;
  private List<Movie> movies;
  
  public void setVar(String var) {
    if (StringUtils.isBlank(var)) {
      throw new IllegalArgumentException("var cannot be null or empty");
    }
    
    this.var = var;
  }

  public void setMovies(List<Movie> movies) {
    this.movies = movies;
  }
  
  @Override
  public void doTag() throws JspException, IOException {
    if (movies == null) {
      return;
    }
    
    JspContext jspContext = getJspContext();
    JspFragment jspBody = getJspBody();
    
    for (Movie movie : movies) {
      jspContext.setAttribute(var, movie);
      jspBody.invoke(null);
    }
  }
}
