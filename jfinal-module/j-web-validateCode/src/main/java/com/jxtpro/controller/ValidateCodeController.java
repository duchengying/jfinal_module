package com.jxtpro.controller;

import com.jfinal.core.Controller;

public class ValidateCodeController extends Controller{
	
	private String CaptchaCode = "code";
	
	public void index(){
		render("index.jsp");
	}

	public void validate(){
		String result = ""; 
		//验证验证码
		if(validateCaptcha(CaptchaCode)){
			// 验证码验证成功
			result = "验证码正确";
		}else{ 
			result = "验证码错误"; 
		} 
		renderText(result);
	}
	
	public void code(){
		renderCaptcha();
	}
}
