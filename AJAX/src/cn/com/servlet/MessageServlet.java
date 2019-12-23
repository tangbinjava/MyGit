package cn.com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.com.bean.Message;
import net.sf.json.JSONArray;


public class MessageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public MessageServlet() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		response.setCharacterEncoding("utf-8");
		System.out.println(name);
		Message message = null;
		if("�Ʊ�".equals(name)){
			message = new Message("�Ʊ�","��",22);
		}
		if("�ܫh��".equals(name)){
			message = new Message("�ܫh��","Ů",22);
		}
		if("¬˼��".equals(name)){
			message = new Message("¬˼��","Ů",22);
		}
		JSONArray jsonArray = JSONArray.fromObject(message);
		response.getWriter().print(jsonArray);
	}

}
