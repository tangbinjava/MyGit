package cn.com.service.impl;

import cn.com.dao.UsersDao;
import cn.com.dao.impl.UsersDaoImpl;
import cn.com.service.IUsersService;

public class UsersService implements IUsersService {
	UsersDao sdao = null; 
	public UsersService() {
		sdao = new UsersDaoImpl();
	}
	@Override
	public boolean login(String name, String password) {
		
		return sdao.login(name, password);
	}
	
}
