package com.jxtpro.service;

import com.jfinal.kit.Ret;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.jxtpro.model.User;

public class UserService {

	public static final UserService me = new UserService();
    final User dao = new User();
	/**
	 * 按照id查看用户
	 * @param id
	 * @return
	 */
	public Ret findById(Integer id) {
		if (id != null){
			Record u = Db.findFirst("select * from user where id=?",id);
			return Ret.create("user", u);
		}
		return Ret.create("user", null);
	}
}
