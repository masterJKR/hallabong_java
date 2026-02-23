<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	
	//     주소?userId=gold&userPw=1234
	//  ? 뒤부분은  파라미터 영역이다.  
	//

	String id = request.getParameter("userId");
	String pw = request.getParameter("userPw");
	

%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3 > 아이디 : <%=id %></h3>
	<h3> 비밀번호 : <%=pw %></h3>
	
</body>
</html>