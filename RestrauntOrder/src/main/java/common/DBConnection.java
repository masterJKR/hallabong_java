package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection getConnection() {
		String dbDrv = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql://codevlab.kr:3306/plane";
		String dbUsr = "plane";
		String dbPsw = "p#2602";
		
		Connection conn = null;
		
		try {
			Class.forName(dbDrv);
			conn = DriverManager.getConnection(dbUrl, dbUsr, dbPsw);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}
