package com.jxtpro.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jfinal.core.Controller;
import com.jfplugin.mail.MailKit;

public class EmailController extends Controller{

	public void index(){
		render("index.jsp");
	}
	
	public void send(){
		
		Map<String,Object> map= new HashMap<String, Object>();
		try{
			String to="jxtpro@163.com";
			List<String> cc=null;
			String subject="中国共产党万岁";
			String text="你好：中国共产党万岁";
			MailKit.send(to, cc, subject, text);
			map.put("statu", "success");
			renderJson(map);	
		}catch(Exception e){
			map.put("statu", "error");
			renderJson(map);	
		}
		
		
		
		
	}
}
