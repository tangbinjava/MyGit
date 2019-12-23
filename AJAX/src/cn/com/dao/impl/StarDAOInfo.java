package cn.com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.com.bean.StarBean;
import cn.com.dao.StarDAO;
import cn.com.dbu.DBUtil;

public class StarDAOInfo implements StarDAO{

	@Override
	public List<StarBean> getStarBeans() {
		// TODO Auto-generated method stub
		List<StarBean> list = new ArrayList<StarBean>();
		StarBean sb = null;
		Connection con = DBUtil.getConn();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql = "select * from Star where t_id = 0";
		try {
			pstm = con.prepareStatement(sql);
			rs = pstm.executeQuery();
			while(rs.next()){
				sb = new StarBean();
				sb.setSid(rs.getInt("s_id"));
				sb.setSname(rs.getString("s_name"));
				sb.setTid(rs.getInt("t_id"));
				list.add(sb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.free(rs, pstm, con);
		}
		return list;
	}

	@Override
	public List<StarBean> getStarInfo(int tid) {
		// TODO Auto-generated method stub
		List<StarBean> list = new ArrayList<StarBean>();
		StarBean sb = null;
		Connection con = DBUtil.getConn();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql = "select * from Star where t_id = ?";
		try {
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, tid);
			rs = pstm.executeQuery();
			while(rs.next()){
				sb = new  StarBean();
				sb.setSid(rs.getInt("s_id"));
				sb.setSname(rs.getString("s_name"));
				sb.setTid(rs.getInt("t_id"));
				list.add(sb);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			DBUtil.free(rs, pstm, con);
		}	
		return list;
	}

}
