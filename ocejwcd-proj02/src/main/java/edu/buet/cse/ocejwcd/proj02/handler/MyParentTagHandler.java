package edu.buet.cse.ocejwcd.proj02.handler;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * The parent tag handler
 * 
 * @author shamim
 */
public class MyParentTagHandler extends SimpleTagSupport {
  @Override
  public void doTag() throws JspException, IOException {
    getJspContext().setAttribute("message", "To be or not to be, that is the question");
    getJspBody().invoke(null);
  }
}
