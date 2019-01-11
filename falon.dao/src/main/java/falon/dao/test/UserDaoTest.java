package falon.dao.test;


import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import falon.bean.User;
import falon.dao.UserMapper;

public class UserDaoTest extends BaseDaoTest {
	
//	private UserMapper mapper ;
//	public UserDaoTest() {
//		mapper = sqlSession.getMapper(UserMapper.class);
//	}
	
	@Test
	public void testInsert() {
		User user = new User();
		user.setUserName("caoyang");
		user.setPassWord("123456");
		user.setNickName("Caoyang");
		user.setPhone("15721420895");
		user.setProfilePhoto("uploads/imgs/ccaa-000-dd.jpg");
		 UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		mapper.insert(user);
		
		Boolean hasId = user.getId() > 0 ? true: false;
		assertEquals(hasId, true);
	}
	
	@Test
	public void testDelete() {
		User user = new User();
		user.setUserName("caoyang");
		user.setPassWord("123456");
		user.setNickName("Caoyang");
		user.setPhone("15721420895");
		user.setProfilePhoto("uploads/imgs/ccaa-000-dd.jpg");
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		mapper.insert(user);
		
		Boolean hasId = user.getId() > 0 ? true: false;
		assertEquals(hasId, true);
		
		mapper.delete(user.getId());
		
	}
	
	@Test
	public void testFind() {
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		System.out.println(mapper);
		User user = new User();
		user.setId(1);
		User returnUser = mapper.find(user);
		System.out.println(returnUser);
		assertEquals(1, returnUser.getId());
		
	}
	
	@Test
	public void testFindByCondition() {
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		System.out.println(mapper);
		User user = new User();
		user.setUserName("caoyang");
		List<User> users = mapper.findByCondition(user);
		System.out.println(users);
		//assertEquals(1, returnUser.getId());
	}
	
}
