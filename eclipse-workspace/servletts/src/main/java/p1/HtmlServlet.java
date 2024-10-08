package p1;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class HtmlServlet extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        // Set content type to text/html
        res.setContentType("text/html");

        try {
            PrintWriter pw = res.getWriter();
            pw.println("<!DOCTYPE html>");
            pw.println("<html>");
            pw.println("<body>");
            pw.println("<h1>My First Heading</h1>");
            pw.println("<p>My first paragraph.</p>");
            // Add the image (assuming it's located in WebContent/images)
            res.setContentType("text/html");
            pw.println("<img src='images/maheshbabu.jpeg' alt='Mahesh Babu Image'/>");
            pw.println("</body>");
            pw.println("</html>");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
