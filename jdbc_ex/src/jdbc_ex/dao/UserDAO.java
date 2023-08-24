package jdbc_ex.dao;

import java.util.List;

import jdbc_ex.domain.UserVO;

public interface UserDAO {

	void insertUser(UserVO user);

	List<UserVO> getUserList();

	UserVO getUser(String id);

	void updateUser(UserVO user);

	void deleteUser(String id);

}