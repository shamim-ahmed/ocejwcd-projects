package edu.buet.cse.ocejwcd.proj02.handler;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.SkipPageException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * A tag that throws SkipPageException when invoked.<br/>
 * The goal is to check the page markup when this tag is included.
 * 
 * @author shamim
 */
public class SkipPageTagHandler extends SimpleTagSupport {
  @Override
  public void doTag() throws JspException, IOException {
    getJspContext().getOut().print("<p class='red-text'>Throwing SkipPageException...<p/>");
    throw new SkipPageException("BOOM");
  }
}
