package edu.buet.cse.ocejwcd.proj02;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
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
