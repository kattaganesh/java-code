package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet  {
    Connection con;
    
    public void init(ServletConfig config) throws ServletException {
        try {
        	ServletContext sc=config.getServletContext();
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","p1234");
            if(con!=null)
            	{System.out.println("Connection Established...");
            	}
            else
            {
            	System.out.println("Failed To Connected.....");
            }
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
            System.out.println(e);
        }
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException {
        try {
            String un = req.getParameter("uname");
            String pw = req.getParameter("password");
            PrintWriter pwr = res.getWriter();
            pwr.println("<html><body text=red>");
            pwr.println("Uname,password"+un+pw+" receieved<br>");
            PreparedStatement pst=con.prepareStatement("select * from public.login_info where uname=? and password=?");
            pst.setString(1, un);
            pst.setString(2, pw);
            pwr.println("Uname,Password Get from table <br>");
            ResultSet rs=pst.executeQuery();
          
            if(rs.next())
            {
            	pwr.print("Welcome to Ameerpet AAA ASIAN SATYAM MALL MR. " + un+"<br>");
            	// RequestDispatcher rd=req.getRequestDispatcher("/reg.html");
                // rd.forward(req,res);
            	res.sendRedirect("");
            }
            
            else {
                 pwr.println("Invalid Username/Password... Try Again<br>");
                 pwr.print("<a href='login.html'><u>Login</u></a><br>");
                 pwr.print("<a href='reg.html'><u>Register</u></a>");
                 RequestDispatcher rd=req.getRequestDispatcher("/homepage.html");
                 rd.include(req,res);
            }
            pwr.println("</body></html>");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
