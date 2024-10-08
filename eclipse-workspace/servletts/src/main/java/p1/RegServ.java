package p1;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")

public class RegServ extends HttpServlet {
	Connection con;
public void init(ServletConfig config) throws ServletException
{
	try
	{
		Class.forName("org.postgresql.Driver");
		con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","p1234");
		System.out.println("connection Established......");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}

}
public void destroy()
{
	try
	{
		con.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
public void doPost(HttpServletRequest req,HttpServletResponse res)
{
	try {
	String fn=req.getParameter("fname");
	String ln=req.getParameter("lname");
	String un=req.getParameter("uname");
	String pw=req.getParameter("pword");
	
	
	PreparedStatement pstmt=con.prepareStatement("insert into public.login_info(fname,lname,uname,password) values(?,?,?,?)");
	pstmt.setString(1, fn);
	pstmt.setString(2, ln);
	pstmt.setString(1, un);
	pstmt.setString(2, pw);
	
	int n=pstmt.executeUpdate();
	PrintWriter pwr=res.getWriter();
	pwr.println("<html><body>");
	pwr.println("Registered with  "+un+"  Successfully..<br>");
	pwr.print("<a href=login.html><u>Login</u></a>");
	
	pwr.println("</html></body>");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	
}

	}


