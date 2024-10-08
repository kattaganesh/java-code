package p1;
import java.sql.*;
public class Type_2Driver {

	public static void main(String[] args) {
		try {
Class c=Class.forName("org.postgresql.Driver");
Connection con=DriverManager.getConnection("jdbc:postgresql//localhost:5432/postgres","postgres","P1234");
//jdbc:oracle:thin:@localhost:1521:orcl
//oracle.jdbc.driver.OracleDriver class
//jdbc:postgresql://localhost/test?user=fred&password=secret&ssl=true
System.out.println("Connection Established Successfully.....");
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
	}

}
