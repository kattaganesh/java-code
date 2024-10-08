<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String f=request.getParameter("first");
String s=request.getParameter("second");
int x=Integer.parseInt(f);
int y=Integer.parseInt(s);
int z=x+y;
out.println("Addition"+z);
%>
</body>
</html>