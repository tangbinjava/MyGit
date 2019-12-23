package cn.com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.com.dao.UsersDao;
import cn.com.dbu.DBUtil;

public class UsersDaoImpl implements UsersDao{

	@Override
	public boolean login(String name, String password) {
		boolean bool = false;
		String sql = "select * from  users where s_name = ? and s_password = ?";
		Connection conn = DBUtil.getConn();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1,name);
			pstm.setString(2,password);
			rs = pstm.executeQuery();
			bool = rs.next();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.free(rs, pstm, conn);
		}
		return bool;
	}
	
}
