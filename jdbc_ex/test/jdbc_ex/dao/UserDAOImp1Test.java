package jdbc_ex.dao;

import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.Test;

import jdbc_ex.domain.UserVO;

class UserDAOImp1Test {
	UserDAO dao = new UserDAOImp1();

//	@Test
//	void testInsertUser() {
//		UserVO user = new UserVO("test", "1234", "�𸣸�Ʈ", "hehe");
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
//		assertEquals(3, list.size(), "����� ������ ��ġ���� ����");
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
//		user.setName("�ְ� ������");
//		dao.updateUser(user);
//	}

	@Test
	void testDeleteUser() {
		dao.deleteUser("test");

		UserVO user = dao.getUser("test");
		assertNull(user);

	}

}
