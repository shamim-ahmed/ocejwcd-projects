package edu.buet.cse.ocejwcd.proj01;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author shamim
 */
@WebServlet(name = "HWServlet",
        initParams = @WebInitParam(name = "count", value = "5"),
        urlPatterns = "/hello.do")
public class HelloWorldServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    response.setContentType("text/plain");
    PrintWriter out = response.getWriter();
    int count = Integer.parseInt(getInitParameter("count"));
    
    for (int i = 0; i < count; i++) {
      out.println("hello world !");
    }
    
    out.close();
  }
}
