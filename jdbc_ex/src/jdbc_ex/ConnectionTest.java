package jdbc_ex;

import java.sql.Connection;

import jdbc_ex.common.JDBCUtil;

public class ConnectionTest {
	public static void main(String[] args) {

		try (Connection conn = JDBCUtil.getConnection()) {
			System.out.println("DB ���� ����");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}