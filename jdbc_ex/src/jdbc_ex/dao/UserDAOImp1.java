package jdbc_ex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc_ex.common.JDBCUtil;
import jdbc_ex.domain.UserVO;

public class UserDAOImp1 implements UserDAO {

	private String USER_LIST = "select * from users";
	private String USER_GET = "select * from users where id = ?";

	private String USER_INSERT = "insert into users values(?, ?, ?, ?)";
	private String USER_UPDATE = "update users set name = ?, role = ? where id = ?";
	private String USER_DELETE = "delete users where id = ?";

	// 처음부터 멤버 변수로 가져갈 것. 모든 메서드에 실행될 필요 없다.
	private Connection conn = JDBCUtil.getConnection();

	// Singleton 패턴
	private static UserDAOImp1 dao = new UserDAOImp1();

	private UserDAOImp1() {

	}

	public static UserDAOImp1 getInstance() {
		return dao;
	}

	@Override
	public void insertUser(UserVO user) {

		try (PreparedStatement stmt = conn.prepareStatement(USER_INSERT)) {

			stmt.setString(1, user.getId());
			stmt.setString(2, user.getPassword());
			stmt.setString(3, user.getName());
			stmt.setString(4, user.getRole());
			stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<UserVO> getUserList() {
		List<UserVO> userList = new ArrayList<UserVO>();

		try (PreparedStatement stmt = conn.prepareStatement(USER_LIST); ResultSet rs = stmt.executeQuery()) {

			while (rs.next()) {
				// 한 행의 정보를 UserVO 객체에 맵핑 시키는 작업. (UserVO객체로 만듦)
				UserVO user = map(rs);

				userList.add(user);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userList;
	}

	@Override
	public UserVO getUser(String id) {

		try (PreparedStatement stmt = conn.prepareStatement(USER_GET)) {
			stmt.setString(1, id);

			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					UserVO user = map(rs);

					return user;
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	private UserVO map(ResultSet rs) throws SQLException {
		UserVO user = new UserVO();
		user.setId(rs.getString("ID"));
		user.setPassword(rs.getString("PASSWORD"));
		user.setName(rs.getString("NAME"));
		user.setRole(rs.getString("ROLE"));
		return user;
	}

	@Override
	public void updateUser(UserVO user) {

		try (PreparedStatement stmt = conn.prepareStatement(USER_UPDATE)) {
			stmt.setString(1, user.getName());
			stmt.setString(2, user.getRole());
			stmt.setString(3, user.getId());
			stmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteUser(String id) {
		try (PreparedStatement stmt = conn.prepareStatement(USER_DELETE)) {
			stmt.setString(1, id);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
