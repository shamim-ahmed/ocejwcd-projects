package edu.buet.cse.ocejwcd.proj02.handler;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * This tag handler has its body content specified as 'tagdependent'.
 * This means that the EL expression in its body will not be evaluated.
 * 
 * @author shamim
 */
public class MyTag2 extends SimpleTagSupport {
  @Override
  public void doTag() throws JspException, IOException {
    getJspContext().setAttribute("message", "A dream within a dream");
    getJspBody().invoke(null);
  }
}
