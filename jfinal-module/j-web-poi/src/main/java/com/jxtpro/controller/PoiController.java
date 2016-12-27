package com.jxtpro.controller;

import java.util.List;

import com.jfinal.core.Controller;
import com.jfinal.ext.render.excel.PoiRender;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;

public class PoiController extends Controller{
	
	
	public void index(){
		render("index1.jsp");
	}

	public void exportExcel(){
		String[]  header={"编号","姓名","邮箱","密码"};
	    String[]  columns={"id","name","email","password"};
	    List<Record> list = Db.find("select * from user");
		try{
		    PoiRender me = PoiRender.me(list).fileName("test.xls").sheetName("rank").headers(header).columns(columns).cellWidth(5000).headerRow(1);
		    render(me);
		    }catch(Exception e){
		        renderNull();
		}       
	}
	
}
