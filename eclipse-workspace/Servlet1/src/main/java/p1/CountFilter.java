package p1;

import jakarta.servlet.FilterChain;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class CountFilter
 */
@WebFilter("/welcome")
public class CountFilter extends   HttpFilter {
       
   public void doFilter(HttpServletRequest req,HttpServletResponse res,FilterChain chain)
   {int count=0;
	   try
	   {
		   count++;
	//ServletContext sc=req.getServletContext();
		   HttpSession sc=req.getSession();
		   
	sc.setAttribute("views", count);
	chain.doFilter(req,res);
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
   }
}
