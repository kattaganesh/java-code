package p1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class GetBook
 */
@WebServlet("/get")
public class GetBook extends HttpServlet {
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		try
		{
			PrintWriter pw=res.getWriter();
			pw.println("<html><body color=red>");
			pw.println("<h1>Selected Books are:</h1><br>");
			
			HttpSession hs=req.getSession();
	  String v1=(String)hs.getAttribute("b1");
	  String v2=(String)hs.getAttribute("b2");
	  String v3=(String)hs.getAttribute("b3");
	  String v4=(String)hs.getAttribute("b4");
	  if(v1!=null)
	  {
		  pw.println(v1+"<br>");
	  }
	  if(v2!=null)
	  {
		  pw.println(v2+"<br>");
	  }

	  if(v3!=null)
	  {
		  pw.println(v3+"<br>");
	  }
	  if(v4!=null)
	  {
		  pw.println(v4+"<br>");
	  }
	 

	  
			pw.println("<a href=books.html>Previous</a>");
			pw.println("</body></html>");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
