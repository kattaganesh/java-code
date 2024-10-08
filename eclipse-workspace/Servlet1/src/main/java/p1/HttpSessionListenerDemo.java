package p1;

import java.sql.Connection;
import java.sql.DriverManager;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionBindingEvent;
/**
 * Application Lifecycle Listener implementation class HttpSessionListenerDemo
 *
 */
@WebListener
public class HttpSessionListenerDemo implements HttpSessionAttributeListener {	
	Connection con;
public void attributeAdded(HttpSessionBindingEvent hse)
{

	try
	{

		 Class.forName("org.postgresql.Driver");
		 con=DriverManager.getConnection("jdbc:postgresql://localhost:5432","postgres","p1234");
		 HttpSession hs=hse.getSession();
		 hs.setAttribute("postgrescon", con);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
public void attributeRemoved(HttpSessionBindingEvent hse)
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
}
