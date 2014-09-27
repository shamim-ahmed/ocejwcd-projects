package edu.buet.cse.ocejwcd.proj03.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * An example to demonstrate how init params can be specified via both <br>
 * deployment descriptor and annotation
 * 
 * @author shamim
 */
@WebServlet(name = "listInitParamServlet",
            urlPatterns = "/list-init-param",
            initParams = @WebInitParam(name = "city", value = "Dhaka"))
public class ListInitParamServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    response.setContentType("text/plain");
    PrintWriter out = response.getWriter();
    
    StringBuilder resultBuilder = new StringBuilder();
    Enumeration<String> initParamNames = getInitParameterNames();
    
    while (initParamNames.hasMoreElements()) {
      String name = initParamNames.nextElement();
      String value = getInitParameter(name);
      resultBuilder.append(String.format("%s = %s%n", name, value));
    }
    
    out.println(resultBuilder.toString());
    out.flush();
  }
}
