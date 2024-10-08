package p1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class SetBooks
 */
@WebServlet("/set")
public class SetBooks extends HttpServlet {
	
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		try
		{
			String s1=req.getParameter("book1");
			String s2=req.getParameter("book2");
			String s3=req.getParameter("book3");
			String s4=req.getParameter("book4");
			HttpSession hs=req.getSession();
			hs.setAttribute("b1", s1);
			hs.setAttribute("b2", s2);
			hs.setAttribute("b3", s3);
			hs.setAttribute("b4", s4);
			
	
			PrintWriter pw=res.getWriter();
			pw.println("<html><body color=cyan>");
			pw.println("<h1>Books Are Added to Cart</h1><br>");
			pw.println("<a href=get?b1="+s1+"&b2="+s2+"&b3="+s3+"&b4="+s4+">Next</a>");
			pw.println("<a href=get >Next</a>");
			pw.println("</body></html>");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
