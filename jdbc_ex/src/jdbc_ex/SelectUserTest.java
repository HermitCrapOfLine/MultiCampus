package jdbc_ex;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import jdbc_ex.common.JDBCUtil;

public class SelectUserTest {

	public static void main(String[] args) {

		try (Connection conn = JDBCUtil.getConnection()) {

			String sql = "select * from users";
			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getString("name"));
			}
			stmt.close();
			rs.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
