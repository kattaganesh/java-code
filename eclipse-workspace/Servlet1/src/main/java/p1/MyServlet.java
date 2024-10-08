package p1;

import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res)
	{
		try
		{
			ServletContext sc=getServletContext();
			String conn=(String)sc.getAttribute("postcon");
			if(conn!=null) {
				System.out.println("Connection Established Successfully.....");
				}
				else
				{
					System.out.println("Connection Failed .....");
				}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
