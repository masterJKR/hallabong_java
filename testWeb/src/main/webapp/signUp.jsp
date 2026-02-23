<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String id = request.getParameter("userId");
	String name = request.getParameter("name");
	
	// checkbox는 배열값으로 전달이므로  values로 받는다.
	String[] interests = request.getParameterValues("interest");
	
	for(String i : interests ){
		out.println( i+"<br>");
	}
%>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>