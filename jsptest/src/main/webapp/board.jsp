<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList ,  board.Board" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board.jsp</title>
</head>
<body>

	<div id="wrap">
		<jsp:include page="menu.jsp"/>
		
		<main id="main">
			<p>여기는 게시판이다</p>
			
			<div id="listWrap">
				<a href="/board/write.do">글쓰기</a>
				
<%
	ArrayList<Board> list = (ArrayList<Board>)request.getAttribute("list");

%>				
				
				<table id="boardList">
					<tr>
						<th>번호</th>
						<th>제목</th>
						<th>작성일</th>
						<th>조회수</th>
					</tr>
					
					<%
						for( Board row : list ){
					%>
						<tr>
							<td> <%=row.getId() %> </td>
							<td> <a href="/board/detail.do?id=<%=row.getId()%>"> <%=row.getTitle() %> </a>  </td>
							<td> <%=row.getCreated_at() %></td>
							<td> <%=row.getHit() %></td>
						</tr>
					<%  } %>
					
					
					
				</table>
			</div>
			
			
		</main>
		
	</div>


</body>
</html>