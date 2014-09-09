package edu.buet.cse.ocejwcd.proj02.handler;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * A tag handler without any body or attribute
 * @author shamim
 */
public class MyTag extends SimpleTagSupport {
  @Override
  public void doTag() throws JspException, IOException {
    JspWriter out = getJspContext().getOut();
    out.print("Hello world");
    out.flush();
  }
}
