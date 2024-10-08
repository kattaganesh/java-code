package p1;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServ extends HttpServlet {
    Connection con=null;
    
    public void init(ServletConfig config) throws ServletException {
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "p1234");
            System.out.println("Connection Established...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void destroy() {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) {
        try {
            String un = req.getParameter("uname");
            String pw = req.getParameter("password");

            PreparedStatement pstmt = con.prepareStatement("select * from public.login_info where uname=? and password=?");
            pstmt.setString(1, un);
            pstmt.setString(2, pw);

            ResultSet rs = pstmt.executeQuery();
            
            // Set response content type and prevent caching
            res.setContentType("text/html");
          
            
            PrintWriter pwr = res.getWriter();
            pwr.println("<html><body text='red'>");
            if (rs.next()) {
                pwr.print("Welcome to Ameerpet AAA ASIAN SATYAM MALL MR. " + un);
            } else {
                pwr.println("Invalid Username/Password... Try Again");
                pwr.print("<a href='reg.html'><u>Register</u></a>");
            }
            pwr.println("</body></html>");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
