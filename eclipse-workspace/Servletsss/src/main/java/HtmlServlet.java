
import jakarta.servlet.*;
import java.io.PrintWriter;
import java.io.IOException;

public class HtmlServlet extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        // Set content type to text/html

        try {
            PrintWriter pw = res.getWriter();
            pw.println("<!DOCTYPE html>");
            pw.println("<html>");
            pw.println("<body>");
            pw.println("<h1>My First Heading</h1>");
            pw.println("<p>My first paragraph.</p>");
            pw.println("</body>");
            pw.println("</html>");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
