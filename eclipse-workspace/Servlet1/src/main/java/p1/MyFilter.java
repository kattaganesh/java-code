package p1;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class MyFilter
 */
@WebFilter("/login")
public class MyFilter extends HttpFilter implements Filter {
  Connection con;     
public void init(FilterConfig config)
{
	try
	{
		Class.forName("org.postgresql.Driver");
		con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","p1234");
		if(con!=null)
		System.out.println("Connection Established successfully....");
		else
			System.out.println("Connection Failed XXXXXXXX....");
			
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
public void destroy(FilterConfig config)

{
	try
	{
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain)
{
	try
	{
		PrintWriter pw=res.getWriter();
		pw.print("<html><body text=red>");
		String un=req.getParameter("uname");
		String pwr=req.getParameter("password");
		PreparedStatement pst=con.prepareStatement("select * from public.login_info where uname=? and password=?");
		pst.setString(1, un);
		pst.setString(2, pwr);
		ResultSet rs=pst.executeQuery();
		if(rs.next())
		{
			pw.println("Welcome TO AmmerPet Hyd Mr. <h1>"+un+"</h1><br>");
		}
		else
		{
			pw.println("Invalid Uname Password Try Again<br>");
			pw.println("<a href=login >Login</a>");
		}pw.println("</body></html>");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	}
}
