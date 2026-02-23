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
	response.getWriter().println("안녕 서버가 보내는 텍스트야");

//  사용자가 서버에 보내는것  request 객체  
//  서버가 사용자에게 보내는건  response 객체 

	response.sendRedirect("test.html");
%>



</body>
</html>



