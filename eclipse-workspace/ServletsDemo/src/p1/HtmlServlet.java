package p1;
import jakarta.servlet.*;
import java.io.PrintWriter;

public class HtmlServlet extends GenericServlet {
public void service(ServletRequest req,ServletResponse res)
{
	try
	{
		PrintWriter pw=res.getWriter();
		pw.println("<html><body>");
		pw.println("<h1>Prashanth Varma</h1>");
		pw.println("</body></html>");
	}
	catch(Exception e)
	{
		System.err.println(e);
	}
}
}
