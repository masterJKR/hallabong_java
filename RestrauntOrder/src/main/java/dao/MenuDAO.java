package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

import common.DBConnection;
import dto.MenuDTO;

public class MenuDAO{
	
	public long getId(MenuDTO menu) {
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "";
		sql += "select id from menu where menu_name = " + menu.getMenuName();
		long id = 0;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			

			while (rs.next()) {
				id = rs.getLong("id");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return id;
	}
	
	public static boolean insert(MenuDTO menu) {
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		
//		menu_img 는 "./resources/img/id.jpg" 로 저장
		menu.setMenuImg("./resources/img/" + menu.getId() + ".jpg");
		
		String sql = "";
		sql += "insert into menu (menu_name, menu_img, price, category) values";
		sql += " (?, ?, ?, ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, menu.getMenuName());
			pstmt.setString(2, menu.getMenuImg());
			pstmt.setInt(3, menu.getPrice());
			pstmt.setString(4, menu.getCategory());
			
			int result = pstmt.executeUpdate();
			
			if (result != 0) {
				System.out.println("메뉴 정상등록");
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static boolean update(MenuDTO menu) {
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		
		
		String sql = "";
		sql += "update menu set ";
		sql += "menu_name = ?,";
//		sql += "menu_img = ?,";
		sql += "price = ?,";
		sql += "category = ?";
		sql += "where id = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, menu.getMenuName());
//			pstmt.setString(2, menu.getMenuImg());
			pstmt.setInt(2, menu.getPrice());
			pstmt.setString(3, menu.getCategory());
			pstmt.setLong(4, menu.getId());
			
			int result = pstmt.executeUpdate();
			
			if (result != 0) {
				System.out.println("메뉴 정상수정");
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static boolean delete(Long id) {
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		
		
		String sql = "";
		sql += "delete from menu where id = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setLong(1, id);
			
			int result = pstmt.executeUpdate();
			
			if (result != 0) {
				System.out.println("메뉴 정상삭제");
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static MenuDTO getMenu(long menuId) {
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		MenuDTO menu = new MenuDTO(menuId, null, null, 0, null);

		String sql = "";
		sql += "select menu_name, price from menu";
		sql += " where id = " + menuId;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String menuName = rs.getString("menu_name");
				int price = rs.getInt("price");
				
				menu.setMenuName(menuName);
				menu.setPrice(price);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return menu;
	}
	
	public static List<MenuDTO> getList() {
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<MenuDTO> list = new ArrayList<>();
		
		String sql = "";
		sql += "select * from menu";
		sql += " order by id asc";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				long id = rs.getLong("id");
				String menuName = rs.getString("menu_name");
				String menuImg = rs.getString("menu_img");
				int price = rs.getInt("price");
				String category = rs.getString("category");
				
				MenuDTO menu = new MenuDTO(id, menuName, menuImg, price, category);
				
				list.add(menu);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		for (MenuDTO menu : menuList) {
//			System.out.println(menu);
//		}
		
		return list;
	}
	
//	public static void main(String[] args) {
//		System.out.println(getListAsJson());
//	}

	// menu 테이블에서 나온 menu 객체 리스트를 json 규격에 따라
	// 자바 스크립트 배열로 변환하는 메서드
	public static String getListAsJson() {
		List<MenuDTO> list = getList();
		StringJoiner sj = new StringJoiner(",", "[", "]");

		for (MenuDTO menu : list) {
			sj.add(menu.toString());
		}
		
//		System.out.println(sj);

		return sj.toString();
	}
}
