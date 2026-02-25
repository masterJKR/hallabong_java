package board;

import java.sql.Date;

import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Board {
	private Long id;
	private String writer;
	private String title;
	private String content;
	private String category;
	private int hit;
	private Date created_at;
	
	// 사용자가 게시글 작성시 필요한 생성자메서드
	public Board(HttpServletRequest request) {
		this.writer = request.getParameter("writer");
		this.title = request.getParameter("title");
		this.content = request.getParameter("content");
		this.category = request.getParameter("category");
	}
}






