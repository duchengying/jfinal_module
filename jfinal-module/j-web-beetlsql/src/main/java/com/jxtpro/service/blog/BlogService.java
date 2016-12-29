package com.jxtpro.service.blog;

import java.sql.SQLException;

import org.beetl.sql.ext.jfinal.Trans;

import com.jfinal.aop.Before;
import com.jfinal.kit.Ret;
import com.jfinal.plugin.activerecord.Page;
import com.jxtpro.model.Blog;
import com.jxtpro.model.base.BaseModel;

@Before(Trans.class)
public class BlogService {

	public static final BlogService me = new BlogService();
	final BaseModel<Blog> base = new BaseModel<Blog>();
	final static Blog dao = new Blog();
	

	public static  Page<Blog> paginate(int pageNumber, int pageSize) {
		return dao.paginate(pageNumber, pageSize, "select *", "from Blog order by id asc");
	}
	
	public Ret update(Blog u){
		try {
			int rt = base.update(u);
			if(rt > 0){
				Trans.commit();
				return Ret.create("result:", "000");
			}
		} catch (Exception e) {
			try {
				Trans.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		return Ret.create("result:", "111");
	}
	
	public Ret save(Blog u){
		try {
			int rt = base.save(u);
			
			if(rt > 0){
				Trans.commit();
				return Ret.create("result", "000");
			}
		} catch (Exception e) {
			try {
				Trans.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		return Ret.create("result", "111");
	}

	public Blog findById(Integer paraToInt) {
		return dao.findById(paraToInt);
	}

	public Ret deleteById(Integer paraToInt) {
		try {
			int rt = base.delete(Blog.class, paraToInt);
			if(rt > 0){
				Trans.commit();
				return Ret.create("result", "000");
			}
		} catch (Exception e) {
			try {
				Trans.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		return Ret.create("result", "111");
	}
}
