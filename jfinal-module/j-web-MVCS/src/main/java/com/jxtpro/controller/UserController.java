package com.jxtpro.controller;

import com.jfinal.core.Controller;
import com.jfinal.kit.Ret;
import com.jxtpro.service.UserService;

public class UserController extends Controller{

	public void index(){
		render("view/index.jsp");
	}
	
	public void findUser(){
		Integer id = getParaToInt("id");
		Ret r = UserService.me.findById(id);
		setAttr("user", r.getData());
		render("view/index.jsp");
	}
}
