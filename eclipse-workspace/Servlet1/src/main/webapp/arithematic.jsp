<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Operation Page</title>
</head>
<body>

<%
String op = request.getParameter("operation");%>
<%if(op.equals("add")){%>
<jsp:forward page="add.jsp"/>
<%}else if(op.equals("sub")){%>
<jsp:forward page="sub.jsp"/>
<%}else if(op.equals("mul")){%>
<jsp:forward page="mul.jsp"/>
<%}else if(op.equals("div")){%>
<jsp:forward page="div.jsp"/>
<%}else{%>
<jsp:forward page="moddiv.jsp"/>
<%}%>

</body>
</html>
