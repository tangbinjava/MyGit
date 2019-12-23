package cn.com.dao;

import java.util.List;

import cn.com.bean.StarBean;

public interface StarDAO {
	/**
	 * 获得明星信息表中的基本信息
	 * @return List<StarBean> 明星的基本信息
	 */
	List<StarBean> getStarBeans();

	/**
	 * 获得明星信息表中的作品信息 
	 * @param tid 作品信息 id
	 * @return List<StarBean> 作品信息
	 */
	List<StarBean> getStarInfo(int tid);
}
