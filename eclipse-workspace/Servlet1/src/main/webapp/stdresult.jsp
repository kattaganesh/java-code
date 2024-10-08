<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 style="color:red;"><u>Student Marks Results</u></h1><br>
<%
    // Retrieve the ResultBean from the session or request
    p1.ResultBean rbj = (p1.ResultBean) request.getAttribute("resultbean");
    
    if (rbj != null) {
%>
Hall Ticket NO: <%= rbj.getHno() %><br>
Student Name: <%= rbj.getSname() %><br>
Subject C: <%= rbj.getC() %><br>
Subject Java: <%= rbj.getJava() %><br>
Subject C++: <%= rbj.getCpp() %><br>
Subject Oracle: <%= rbj.getOracle() %><br>

<% 
        out.println("Successfully Marks Are Fetched....");
    } else {
        out.println("No result found.");
    }
%>
</body>
</html>
