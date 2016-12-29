package com.jxtpro.controller.user;

import com.jfinal.core.Controller;
import com.jfinal.kit.Ret;
import com.jxtpro.model.User;
import com.jxtpro.service.user.UserService;

public class UserController extends Controller{

	public void update(){
		User user = getModel(User.class);
		Ret r = UserService.me.save(user);
		renderJson(r.getData());
	}
}
