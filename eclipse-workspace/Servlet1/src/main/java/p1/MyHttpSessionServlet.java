package p1;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class MyHttpSessionServlet
 */
@WebServlet("/MyHttpSessionServlet")
public class MyHttpSessionServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res)
	{
		HttpSession hs=req.getSession();
		String conn=(String)hs.getAttribute("postgrescon");//postgrescon
		if(conn!=null) {
		System.out.println("Connection Established Successfully.....");
		}
		else
		{
			System.out.println("Connection Failed .....");
		}
	}
	

}
