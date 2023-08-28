package org.galapagos.jelly.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// 데이터베이스와 연결하는 클래스 제일 처음 해야될 일
public class JDBCUtil {
	static Connection conn = null;
	static { // 스태틱 초기화 블록
		try {
			// 오라클 JDBC
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			String url = "jdbc:oracle:thin:@localhost:1521:xe";
//			String id = "GLORY";
//			String password = "1234";

			// MySQL JDBC
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3307/glory_db";
			String id = "GLORY";
			String password = "1234";

			conn = DriverManager.getConnection(url, id, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return conn;
	}

	public static void close() {
		try {
			if (conn != null) {
				conn.close();
				conn = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
