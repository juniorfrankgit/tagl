package fr.imag.tagl.servlets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import fr.imag.tagl.redis.RedisServer;


public class MainServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private final RedisServer server = new RedisServer();

	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		ServletOutputStream output = resp.getOutputStream();
		StringBuffer jb = new StringBuffer();
		JSONParser parser = new JSONParser();
		  String line = null;
		  try {
		    BufferedReader reader = req.getReader();
		    while ((line = reader.readLine()) != null)
		      jb.append(line);
		  } catch (Exception e) { /*report an error*/ }

		  try {
		    JSONObject jsonObject = (JSONObject)parser.parse(jb.toString());
		    //System.out.println(jsonObject.toJSONString());
		    server.put(jsonObject.toJSONString());
		  } catch (ParseException e) {
		    throw new IOException("Error parsing JSON request string");
		  }
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		PrintWriter writer = resp.getWriter();
		resp.setContentType("application/json");		
	}
}
