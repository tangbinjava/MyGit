package cn.com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import cn.com.bean.StarBean;
import cn.com.dao.StarDAO;
import cn.com.dao.impl.StarDAOInfo;


public class StarServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public StarServlet2() {
    	 super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter pw = response.getWriter();
		StarDAO dao = new StarDAOInfo();
		int tid = Integer.parseInt(request.getParameter("tid"));
		List<StarBean> list = dao.getStarInfo(tid);
		Gson gson = new Gson();
		String json = gson.toJson(list);
		pw.write(json);
		pw.flush();
		pw.close();
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
