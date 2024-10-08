package p1;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Servlet implementation class Gen
 */
@WebServlet("/Gen/ghjgh")
public class Gen extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public Gen() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		Date d=new Date();
	//	response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.print("<html><body text=red><h1>")	;
		pw.print(d.getDate()+"-"+d.getMonth()+"-"+d.getYear()+d.getHours()+":"+d.getMinutes()+":"+d.getSeconds()+":");
		pw.print("</h1></body></html>");	}

}
