package fr.imag.tagl.servlets;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.imag.tagl.redis.RedisServer;

public class WorkerServlet extends HttpServlet implements Runnable{
	private boolean isDoGet = true;
	private HttpServletRequest request;
	private HttpServletResponse response;
	private RedisServer server;
	
	public WorkerServlet(boolean isDoGet, HttpServletRequest req, HttpServletResponse resp, RedisServer server){
		this.isDoGet = isDoGet;
		this.response = resp;
		this.request = req;
		this.server = server;
	}
	public void doGet(HttpServletRequest req ,HttpServletResponse resp){
		String studentNumber = req.getParameter("studentNumber");
		String student = server.get(studentNumber);
		resp.setContentType("application/json");
		resp.setCharacterEncoding("UTF-8");
		try {
			resp.getOutputStream().println(student);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void doPost(HttpServletRequest req ,HttpServletResponse resp){
		System.out.println(req);
		System.out.println(req.getCharacterEncoding());
		String student = req.getParameter("student");
		server.put(student);
		System.out.println(student);
	}

	public void run() {
		if(this.isDoGet){
			doGet(request, response);
		}else{
			doPost(request, response);
		}
	}
}
