package jdbc_ex.dao;

import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.Test;

import jdbc_ex.domain.UserVO;

class UserDAOImp1Test {
	UserDAO dao = new UserDAOImp1();

//	@Test
//	void testInsertUser() {
//		UserVO user = new UserVO("test", "1234", "모르모트", "hehe");
//		dao.insertUser(user);
//
//		user = dao.getUser("test");
//		assertNotNull(user);
//		assertEquals("test", user.getId());
//	}
//
//	@Test
//	void testGetUserList() {
//		List<UserVO> list = dao.getUserList();
//		assertEquals(3, list.size(), "목록의 개수가 일치하지 않음");
//
////		for (UserVO user : list) {
////			System.out.println(user);
////		}
//	}
//
//	@Test
//	void testGetUser() {
//		UserVO user = dao.getUser("admin");
//		assertNotNull(user);
//		assertEquals("admin", user.getId());
//	}
//
//	@Test
//	void testUpdateUser() {
//		UserVO user = dao.getUser("admin");
//		user.setName("최고 관리자");
//		dao.updateUser(user);
//	}

	@Test
	void testDeleteUser() {
		dao.deleteUser("test");

		UserVO user = dao.getUser("test");
		assertNull(user);

	}

}
