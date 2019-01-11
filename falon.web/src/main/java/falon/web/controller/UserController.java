package falon.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import falon.bean.User;
import falon.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/insert")
	public String insert(Model model) {
		
		User user = new User();
		user.setUserName("caoyang");
		user.setPassWord("123456");
		user.setNickName("Caoyang");
		user.setPhone("15721420895");
		user.setProfilePhoto("uploads/imgs/ccaa-000-dd.jpg");
		
		userService.insert(user);
		
		model.addAttribute("user", user);
		
		return "user";
	}
}
