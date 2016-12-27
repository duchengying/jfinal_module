package com.jxtpro.controller;

import java.util.List;

import com.jfinal.core.Controller;
import com.jxtpro.model.User;

public class IndexController extends Controller{
	
	public void index(){
		List<User> user = User.dao.find("select * from user");
		setAttr("user",user);
		render("index.jsp");
	}
}
