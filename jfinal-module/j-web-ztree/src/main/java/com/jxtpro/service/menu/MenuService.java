package com.jxtpro.service.menu;

import java.util.List;

import org.apache.log4j.Logger;

import com.jfinal.kit.Ret;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.jxtpro.model.Menu;

public class MenuService {
	
	final Logger log = Logger.getLogger(getClass());
	public static final MenuService me = new MenuService();
	final Menu dao = new Menu();
	
	/**
	 * 初始化 菜单
	 * @return
	 */
	public Ret Init(){
		try{
			String sql = "select * from menu";
		    List<Record> menus = Db.find(sql);
		    return Ret.create("menus", menus);
		}catch(Exception e){
			log.error("初始化菜单失败 ： "+e.getMessage());
			return null;
		}
	}
}
