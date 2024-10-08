<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body><h1>
<jsp:useBean id="ob" class="p1.EmpJavaBeanClass" />
<jsp:setProperty name="ob" property="*" />
<%out.println("Employee Details are:"); %>
EMPNO:<jsp:getProperty name="ob" property="eid"/>
ENAME:<jsp:getProperty name="ob" property="ename"/>
ESALRY:<jsp:getProperty name="ob" property="esal"/>
</h1>
</body>
</html>