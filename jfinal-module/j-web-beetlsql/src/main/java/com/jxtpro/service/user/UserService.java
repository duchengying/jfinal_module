package com.jxtpro.service.user;

import java.sql.SQLException;

import org.beetl.sql.ext.jfinal.Trans;

import com.jfinal.aop.Before;
import com.jfinal.kit.Ret;
import com.jfinal.plugin.activerecord.Page;
import com.jxtpro.model.User;
import com.jxtpro.model.base.BaseModel;

@Before(Trans.class)
public class UserService {

	public static final UserService me = new UserService();
	final BaseModel<User> base = new BaseModel<User>();
    final static User dao = new User();
	
	public static Page<User> paginate(int pageNumber, int pageSize) {
		return dao.paginate(pageNumber, pageSize, "select *", "from user order by id asc");
	}
	
	public Ret update(User u){
		try {
			int rt = base.update(u);
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
	
	public Ret save(User u){
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
}
