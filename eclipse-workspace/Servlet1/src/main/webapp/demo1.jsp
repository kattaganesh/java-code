<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ameerpet Adda</title>
</head>
<body>
<h1><%! int count=0 ;%></h1>
This page has been accesed <%= count++ %>times
<br>
<%!java.util.Date d=new java.util.Date(); %>
<%=d.getDate() %>-
<%=d.getMonth()%>-
<%= d.getYear()%>  <%=d.getHours() %>:
<%=d.getMinutes()%>:
<%= d.getSeconds()%>
<%-- to print the localdate and localtime --%>
<table border=20>
<% for(int i=1;i<=10;i++){%>
<tr>
<td>5</td>
<td>x</td>
<td><%= i%></td>
<td>=</td>
<td><%= 5*i%></td>

</tr>
<%} %>
</table>
</body>
</html>