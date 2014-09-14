package edu.buet.cse.ocejwcd.proj02.handler;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import org.apache.commons.lang3.StringUtils;

/**
 * This tag handler demonstrates how to pass a Writer to invoke() method in
 * order to get access to the evaluated body content.
 * 
 * @author shamim
 */
public class ToUpperCaseHandler extends SimpleTagSupport { 
  private String var;
  private String message;

  public void setVar(String var) {
    if (StringUtils.isBlank(var)) {
      throw new IllegalArgumentException("var cannot be empty");
    }
    
    this.var = var;
  }
  
  public void setMessage(String message) {
    this.message = message;
  }
  
  @Override
  public void doTag() throws JspException, IOException {
    ByteArrayOutputStream outStream = new ByteArrayOutputStream();
    Writer writer = new OutputStreamWriter(outStream);
    
    getJspContext().setAttribute(var, message);
    getJspBody().invoke(writer);
    writer.flush();   // this line is CRUCIAL
    
    String content = outStream.toString("UTF-8");
    
    if (StringUtils.isNotBlank(content)) {
      content = content.toUpperCase().replace("\n", "<br/>");
    }
    
    JspWriter out = getJspContext().getOut();
    out.write(content);
    out.flush();
  }
}
