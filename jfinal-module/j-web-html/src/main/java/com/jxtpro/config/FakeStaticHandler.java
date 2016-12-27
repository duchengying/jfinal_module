package com.jxtpro.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jfinal.handler.Handler;

public class FakeStaticHandler extends Handler{

	@Override
	public void handle(String target, HttpServletRequest request,
			HttpServletResponse response, boolean[] isHandled) {
		
		
		int index = target.lastIndexOf(".html");
	    if (index != -1) {
	      target = target.substring(0, index);
	    }
	    next.handle(target, request, response, isHandled);
	}

}
