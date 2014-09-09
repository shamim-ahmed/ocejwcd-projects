package edu.buet.cse.ocejwcd.proj02.handler;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * A tag handler with a body and attribute
 * @author shamim
 */
public class PrintBodyHandler extends SimpleTagSupport {
  private int start;
  private int end;
  
  public void setStart(int start) {
    this.start = start;
  }

  public void setEnd(int end) {
    this.end = end;
  }
  
  @Override
  public void doTag() throws JspException, IOException {
    for (int i = start; i <= end; i++) {
      getJspBody().invoke(null);
    }
  }
}
