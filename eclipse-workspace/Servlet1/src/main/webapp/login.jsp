<%@ page import="java.sql.DriverManager" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
</head>
<body text='red' bgcolor='cyan'>

<%!
java.sql.Connection con;
public void jspInit() {
    try {
        Class.forName("org.postgresql.Driver");
        con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "p1234");
        if (con != null) {
            System.out.println("Connection Established ......");
        } else {
            System.out.println("Connection Failed.....");
        }
    } catch (Exception e) {
        e.printStackTrace();
       // Prevent further execution
    }
}

public void jspDestroy() {
    try {
        if (con != null && !con.isClosed()) {
            con.close();
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
%>

<%
String un = request.getParameter("uname");
String pw = request.getParameter("pword");

try {
    java.sql.PreparedStatement pst = con.prepareStatement("SELECT * FROM login_info WHERE uname=? AND password=?");
    pst.setString(1, un);
    pst.setString(2, pw);
    java.sql.ResultSet rs = pst.executeQuery();
    if (rs.next()) {
    	

    } else {
        out.println("You entered " + un + " incorrectly. Please try again...");
    }
    rs.close();
    pst.close();
} catch (Exception e) {
    e.printStackTrace();
}
%>

<%@ include file="homepage.html" %>
<%@ include file="demo1.jsp" %>
<jsp:forward page="/welcome"/>

</body>
</html>
