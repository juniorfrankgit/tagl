package fr.imag.tagl.redis;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class RedisServerTest {
	private RedisServer server;
	private JSONObject student1;
	private JSONObject student2;
	private JSONParser parser;
	private ArrayList<String> list;
	
	@Before public void init() {
		server = new RedisServer();
		student1 = new JSONObject();
		student2 = new JSONObject();
		parser = new JSONParser();
		student1.put("name", "Ngassam");
		student1.put("firstname", "Junior Frank");
		student1.put("age", "26");
		student1.put("studentNumber", "007");
		
		student2.put("name", "Ngassam");
		student2.put("firstname", "Junior Frank");
		student2.put("age", "26");
		student2.put("studentNumber", "008");
		list = new ArrayList<String>();
	}
	@After public void cleanUp(){
		server = null;
		student1 = null;
		student2 = null;
		parser = null;
		list = null;
	}
	
	@Test
	public void testGet() {
		
	}
	
	@Test
	public void testPut() {
		Long size1 = server.put(student1.toJSONString());
		Long size2 = server.put(student2.toJSONString());
		assertEquals("Verifie que la taille de la liste incrémente après un ajout",1,size2-size1);
	}
}
