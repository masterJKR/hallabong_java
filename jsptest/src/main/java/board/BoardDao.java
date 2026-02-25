package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

// 게시판 테이블관련 작업 전부 수행 하는 클래스
public class BoardDao {
	private Connection conn;
	private Statement st;
	private PreparedStatement pt;
	private ResultSet rs;
	
	// 게시글 목록 보여주기 위해 DB에서 값가져오기
	public ArrayList<Board> findAll(){
		String sql = "select * from board";
		ArrayList<Board> list = new ArrayList();
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while( rs.next() ) {
				Board data = new Board(
	rs.getLong("id"), rs.getString("writer"), rs.getString("title"),
	rs.getString("content"), rs.getString("category"), 
	rs.getInt("hit"), rs.getDate("created_at")
						);
				
				list.add(data);
			}
			
		}catch(SQLException e) {
			System.out.println("게시글 전체 불러오기 실패");
			e.printStackTrace();
		}
		
		return list;
		
	}
	
	
	// 입력한 게시글 값 테이블에 저장하기
	public void save(Board board) {
		
		String sql = 
		"insert into board(writer, title, content, category)"
		+ " values(?,?,?,?)";
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, board.getWriter());
			pt.setString(2, board.getTitle() );
			pt.setString(3, board.getContent());
			pt.setString(4, board.getCategory());
			pt.executeUpdate();  
// executeUpdate 는  insert, update, delete 할때 사용
// executeQuery는  select 할때 사용
			
		}catch(SQLException e) {
			System.out.println("게시글 저장 실패");
			e.printStackTrace();
		}
	}
	
	
	
	public BoardDao() {
		connect(); // 데이터베이스 연결을 위한 메서드
	}
	
	private void connect() {
		// 데이터베이스 드라이버 실행 - 연결
		// 계정 로그인 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username="krkr";
			String password="1234";
			String url="jdbc:mysql://localhost:3306/krkr";
			conn = DriverManager.getConnection(url, username,password);
			
		}catch(Exception e) {
			System.out.println("접속 실패");
			e.printStackTrace();
		}
	}

	// 상세페이지에 제공할 게시글 하나 조회하여 service에 넘기기
	public Board findById(long id) {
		String sql="select * from board where id=?";
		
		Board board = null;
		try {
			pt = conn.prepareStatement(sql);
			pt.setLong(1, id);
			rs = pt.executeQuery();
			if( rs.next() ) {
				board = new Board(
						rs.getLong("id"), rs.getString("writer"), rs.getString("title"),
						rs.getString("content"), rs.getString("category"), 
						rs.getInt("hit"), rs.getDate("created_at")
											);
			}		
			
		}catch(SQLException e) {
			
		}
		
		return board;
	}
}
