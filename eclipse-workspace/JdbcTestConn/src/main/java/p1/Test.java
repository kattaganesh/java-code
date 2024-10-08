package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
public class Test {
	
	public static void main(String[] args) {
		
	try {
	 Class.forName("org.postgresql.Driver");
	 Connection   con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","p1234");
     if(con!=null)
     	{System.out.println("Connection Established...");
     	}
     else
     {
     	System.out.println("Failed To Connected.....");
     }
     
Statement stmt=con.createStatement();
     ResultSet rs=stmt.executeQuery("select * from EmployeeJdbc");
     ResultSetMetaData rd=rs.getMetaData();
     int n=rd.getColumnCount();
    System.out.println(n);
     while(rs.next())
     {
    	 System.out.print(rs.getString(1));
     }
     
     
     
     
     
     
     
 }
	catch (Exception e) {
     e.printStackTrace();
 }
}
}