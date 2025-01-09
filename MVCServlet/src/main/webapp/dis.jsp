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
session =request.getSession();
String name=(String)session.getAttribute("name");
String addmision=(String)session.getAttribute("addmission");
String password=(String)session.getAttribute("password");
int marks=(int)session.getAttribute("marks");

out.println(name+" "+addmision+" "+password+ " "+marks);
%>
</body>
</html>