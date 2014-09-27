package edu.buet.cse.ocejwcd.proj04.m1.servlet;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * A servlet that displays an image <br>
 * Note: The image in this example is packaged as part of a different module
 *
 * @author shamim
 */
@WebServlet("/display-image")
public class DisplayImageServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    ByteArrayOutputStream imageData = new ByteArrayOutputStream();
    
    try (InputStream in = getServletContext().getResourceAsStream("/WEB-INF/images/beautiful-mosque.jpg")) {
      byte[] buffer = new byte[1024];
      int n;
      
      while ((n = in.read(buffer)) != -1) {
        imageData.write(buffer, 0, n);
      }
      
      response.setContentType("image/jpg");
      ServletOutputStream out = response.getOutputStream();
      out.write(imageData.toByteArray());
      out.flush();
    }
  }
}
