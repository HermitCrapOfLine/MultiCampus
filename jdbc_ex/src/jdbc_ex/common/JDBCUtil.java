package jdbc_ex.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
	static Connection conn = null;
	static { // 스태틱 초기화 블록
		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			String url = "jdbc:oracle:thin:@localhost:1521:xe";
//			String id = "jdbc_ex";
//			String password = "jdbc_ex";

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
