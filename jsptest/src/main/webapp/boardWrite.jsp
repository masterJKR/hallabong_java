<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boardwrite.jsp</title>
</head>
<body>

	<div id="wrap">
		<jsp:include page="menu.jsp"/>
		
		<main id="main">
			<form method="post" action="/board/save.do">
				작성자 : <input type="text" name="writer">  <br>
				제목 : <input type="text" name="title">  <br>
				내용 : <textarea name="content" rows="10" cols="50"></textarea>
				카테고리 : <select name="category">
							<option value="music">음악</option>
							<option value="game">게임</option>
							<option value="money">돈</option>
							<option value="movie">영화</option>
						</select>  <br>
				<button>작성</button>
			</form>
			
		</main>
		
	</div>


</body>
</html>