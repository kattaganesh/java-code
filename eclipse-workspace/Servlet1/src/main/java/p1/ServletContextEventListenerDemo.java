package p1;

import java.sql.Connection;
import java.sql.DriverManager;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextAttributeEvent;
import jakarta.servlet.ServletContextAttributeListener;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ServletContextEventListenerDemo
 *
 */
@WebListener
public class ServletContextEventListenerDemo implements ServletContextAttributeListener {
Connection con;
 public void attributeAdded(ServletContextAttributeEvent sce)
 {
	 try {
	 Class.forName("org.postgresql.Driver");
	 con=DriverManager.getConnection("jdbc:postgresql://localhost:5432","postgres","p1234");
	 ServletContext sc=sce.getServletContext();
	 sc.setAttribute("postcon", "con");
	 
	 
	 
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
 }
 public void attributeRemoved(ServletContextAttributeEvent sce)
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
