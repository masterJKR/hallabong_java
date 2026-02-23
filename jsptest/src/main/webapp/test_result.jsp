<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%--  test_result.jsp --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<% 
		String name = request.getParameter("myName");
		int age = Integer.parseInt( request.getParameter("age") );
		String job = request.getParameter("job");
	
	//	session : 서버와의 연결을 유지 하기 위해 사용되는객체 
	//     주로 로그인상태 유지에 많이 사용된다. 
		
		session.setAttribute("userName", name);
		request.setAttribute("age", age);
		
	%>

	<p> 이름 : <%=name %> </p>
	<p> 나이 : <%=age %> </p>
	<p> 직업 : <%=job %> </p>

	<a href="세션테스트.jsp">페이지 이동</a>

</body>
</html>