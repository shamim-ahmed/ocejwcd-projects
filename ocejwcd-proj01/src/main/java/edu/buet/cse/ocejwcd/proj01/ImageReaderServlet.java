package edu.buet.cse.ocejwcd.proj01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Declare a servlet with only its logical name using annotations
 * 
 * @author shamim
 */
@WebServlet(name = "imageReader")
public class ImageReaderServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) 
  throws ServletException, IOException {
    response.setContentType("image/jpeg");
    
    InputStream in = getServletContext().getResourceAsStream("/WEB-INF/images/orion.jpg");
    OutputStream out = response.getOutputStream();
    byte[] buffer = new byte[1024];
    int n;
    
    while ((n = in.read(buffer)) != -1) {
      out.write(buffer, 0, n);
    }
    
    out.flush();
  }
}
