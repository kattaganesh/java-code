package p1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/welcome")
public class WelcomePage extends HttpServlet {
    
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {
            HttpSession sc = req.getSession();
            int n = (Integer)sc.getAttribute("views");
            PrintWriter pww = res.getWriter();
            pww.println("<html><body text='red'>");
            pww.println(sc.getCreationTime()+" "+sc.getMaxInactiveInterval()+" "+sc.getId());
            pww.println("count.html accessed " + n + " Times");
            pww.println("</body></html>");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
