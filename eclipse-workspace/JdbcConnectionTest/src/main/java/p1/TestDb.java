package p1;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestDb {
	public static void main(String[] args) 
	{
	try {
        Class.forName("org.postgresql.Driver");
     Connection   con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "p1234");
     if(con!=null)
     {
        System.out.println("Connection Established successfully...");
    } 
    
     else
     {
    	 System.out.println("Connection Failed.....");
     }
	}catch (Exception e) {
        e.printStackTrace();
    }}
}
