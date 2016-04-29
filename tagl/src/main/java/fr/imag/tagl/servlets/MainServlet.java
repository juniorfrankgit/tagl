package fr.imag.tagl.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.parser.JSONParser;
import fr.imag.tagl.redis.RedisServer;


public class MainServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private final RedisServer server = new RedisServer();

	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		new Thread(new WorkerServlet(false, req, resp, server)).start();
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		new Thread(new WorkerServlet(true, req, resp, server)).start();		
	}
}
