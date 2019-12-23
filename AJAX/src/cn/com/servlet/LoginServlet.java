package cn.com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.com.service.IUsersService;
import cn.com.service.impl.UsersService;



public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IUsersService service =null; 
   
    public LoginServlet() {
        super();
        
    }
    @Override
    public void init() throws ServletException {
    	service = new UsersService();
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			this.doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		String name = request.getParameter("name");
		System.out.println(name);
		String password = request.getParameter("password");
		System.out.println(password);
		HttpSession session = request.getSession();
		if(service.login(name, password)){
			session.setAttribute("Users", name);
			request.getRequestDispatcher("Panel.jsp").forward(request, response);
		}else {
			response.sendRedirect("Users.jsp");
		}
	}

}


