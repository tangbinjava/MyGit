<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户界面</title>
</head>
<body>
	<%
	String a = (String)session.getAttribute("Users");
		
	%>
		<%=a %>您好，欢迎您的登录!
</body>
</html>