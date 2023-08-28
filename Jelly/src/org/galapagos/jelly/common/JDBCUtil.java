package org.galapagos.jelly.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// �����ͺ��̽��� �����ϴ� Ŭ���� ���� ó�� �ؾߵ� ��
public class JDBCUtil {
	static Connection conn = null;
	static { // ����ƽ �ʱ�ȭ ���
		try {
			// ����Ŭ JDBC
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
