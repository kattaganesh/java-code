package p1;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.rowset.WebRowSet;
import com.sun.rowset.WebRowSetImpl;

public class Demo1 {

    public static void main(String[] args) {
        Connection conn = null;
        WebRowSet webRowSet = null;

        try {
            // Load PostgreSQL JDBC Driver
            Class.forName("org.postgresql.Driver");

            // Establish connection
            conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/test", // Replace with your DB info
                "postgres", // Your PostgreSQL username
                "P1234"     // Your PostgreSQL password
            );

            // Create WebRowSet object
            webRowSet = new WebRowSetImpl();

            // Execute SQL query and populate WebRowSet
            webRowSet.setCommand("SELECT * FROM emp"); // Replace 'your_table' with an actual table name
            webRowSet.execute();

            // Iterate over the WebRowSet (which behaves like a ResultSet)
            while (webRowSet.next()) {
                System.out.println("Column 1: " + webRowSet.getString(1)); // Get column data by index
                System.out.println("Column 2: " + webRowSet.getString(2)); // Example for another column
            }

            // Write the WebRowSet as XML
            webRowSet.writeXml(System.out);

        } catch (ClassNotFoundException e) {
            System.err.println("PostgreSQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("SQL Exception occurred.");
            e.printStackTrace();
        } finally {
            // Close the WebRowSet and Connection
            try {
                if (webRowSet != null) webRowSet.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
