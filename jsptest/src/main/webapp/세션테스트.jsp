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
		String age = (String)request.getAttribute("age");
	
		String name = (String)session.getAttribute("userName");
	
	%>
	
	<%=age %> <br>
	<%=name %>
	
	
</body>
</html>