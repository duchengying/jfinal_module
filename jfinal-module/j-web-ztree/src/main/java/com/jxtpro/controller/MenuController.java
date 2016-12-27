package com.jxtpro.controller;

import com.jfinal.core.Controller;
import com.jfinal.kit.Ret;
import com.jxtpro.service.menu.MenuService;
/**
 * 菜单控制器
 * @author x
 *
 */
public class MenuController extends Controller{

	public void index(){
		Ret r = MenuService.me.Init();
		renderJson(r.getData().get("menus"));
	}
}
