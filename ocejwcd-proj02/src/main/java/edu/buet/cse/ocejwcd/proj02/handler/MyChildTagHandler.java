package edu.buet.cse.ocejwcd.proj02.handler;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.SkipPageException;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * The child tag handler
 * 
 * @author shamim
 */
public class MyChildTagHandler extends SimpleTagSupport {
  @Override
  public void doTag() throws JspException, IOException {
    JspTag parent = getParent();
    
    if (parent == null) {
      throw new SkipPageException("Parent tag cannot be null");
    }
    
    if (!(parent instanceof MyParentTagHandler)) {
      throw new SkipPageException(String.format("Illegal parent tag of type %s", parent.getClass().getSimpleName()));
    }
    
    JspWriter out = getJspContext().getOut();
    out.write(String.format("Parent tag is of type %s", parent.getClass().getSimpleName()));
    out.write("<br/>");
    getJspBody().invoke(null);
  }
}
