package board;

import java.util.ArrayList;

import jakarta.servlet.http.HttpServletRequest;

// 게시판 관련 여러가지 일 을 할 클래스
public class BoardService {
	
	private BoardDao boardDao = new BoardDao();
	
	
	// 게시글 전체 데이터 가져오기
	//  DAO를 통해 전체데이터(ArrayList) 받아서  서블릿에 넘겨주기
	// 만약 게시글 목록에 대해 페이징을 한다면 아래 메서드는 페이징에 필요한
	// 값을 매개변수로  서블릿을통해 받아서  DAO 메서드에게 전달해 주어야한다.
	public ArrayList<Board> boardList(){
		return boardDao.findAll();
	}
	
	
	// 사용자가입력한 값은 request내장객체에 파라미터로 저장되어있다. 
	// 서블릿(BoardController)로부터 request객체 받아와야 입력값 꺼낼수 있다.
	public void boardSave(HttpServletRequest request) {
		Board board = new Board(request);
		
		boardDao.save(board);		
	}


	public Board detail(String parameter) {
		
		Board board = boardDao.findById( Long.parseLong(parameter) );
		
		return board;
	}
}



