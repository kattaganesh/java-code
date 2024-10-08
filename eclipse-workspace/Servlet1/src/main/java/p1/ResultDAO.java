package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class ResultDAO {
public ResultBean getResult(int hno)
{
	ResultBean rb=null;
	try {
	Class.forName("org.postgresql.Driver");
	Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","p1234");
	if(con!=null)
	{
		System.out.println("Connected to Database...");
	}
	else
	{
		System.out.println("Failed To Connect to Database");
	}
	PreparedStatement pst=con.prepareStatement("select * from results_t where hno=? ");
	pst.setInt(1,hno);
ResultSet rs=pst.executeQuery();
ResultSetMetaData rm=rs.getMetaData();
int n=rm.getColumnCount();
if(rs.next())
{
	
		System.out.println(rs.getString(2));
	
}

if(rs.next())
{
rb.setHno(rs.getInt(2));
rb.setSname(rs.getString(3));
rb.setC(rs.getInt(4));
rb.setJava(rs.getInt(5));
rb.setCpp(rs.getInt(6));
rb.setOracle(rs.getInt(7));

}

	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
return rb;

	}
}
