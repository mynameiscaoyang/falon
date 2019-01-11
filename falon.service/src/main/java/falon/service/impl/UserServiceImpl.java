package falon.service.impl;

import org.springframework.stereotype.Service;

import falon.bean.User;
import falon.dao.UserMapper;
import falon.service.UserService;

@Service
public class UserServiceImpl extends CRUDServiceImpl<User , UserMapper> implements UserService {
	
}
