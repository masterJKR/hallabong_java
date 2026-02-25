<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="board.Board" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boarddetail.jsp</title>
</head>
<body>

	<div id="wrap">
		<jsp:include page="menu.jsp"/>

<%
	Board board = (Board)request.getAttribute("data");
%>
		<main id="main">
			<p>여기는 게시판 상세페이지 </p>
			<p>작성자 : <%=board.getWriter() %></p>
			<p>제목 : <%=board.getTitle() %> </p>
			<p>내용 : <p><%=board.getContent() %></p>   </p>
			<p>작성일 : <%=board.getCreated_at() %> </p>
			<p>조회수 : <%=board.getHit() %></p>
			<p> 카테고리 : <%=board.getCategory() %> </p>
			
		</main>
		
	</div>


</body>
</html>