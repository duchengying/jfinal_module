package com.jxtpro.controller;

import java.util.Set;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.stat.DruidDataSourceStatManager;
import com.jfinal.core.Controller;

public class IndexController extends Controller{

	public void index(){
	    Set<DruidDataSource> dataSources = DruidDataSourceStatManager.getDruidDataSourceInstances();
	    this.setAttr("datasource", dataSources);
	    render("/view/common/data.html");
	}
}
