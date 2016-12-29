package com.jxtpro.model.base;

import org.beetl.sql.core.SQLManager;
import org.beetl.sql.ext.jfinal.JFinalBeetlSql;

import com.jfinal.plugin.activerecord.Model;

public class BaseModel<T extends Model<T>> {
	
	
	public static final SQLManager base = JFinalBeetlSql.dao();
	
	public Integer save(T t) throws Exception{
		return base.insert(t);
	}
	
	public Integer update(T t) throws Exception{
		return base.updateById(t);
	}
	
	public Integer delete(Class<?> cla,Integer id){
		return base.deleteById(cla, id);
	}
	
}
