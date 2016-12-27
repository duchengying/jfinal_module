package com.jxtpro.controller;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Page;
import com.jxtpro.model.User;

public class IndexController extends Controller{
	
	public void index(){
		Page<User> user = User.dao.paginate(getParaToInt(0, 1), 3);
		setAttr("user",user);
//		render("index.html");
		render("index.jsp");
	}
}
