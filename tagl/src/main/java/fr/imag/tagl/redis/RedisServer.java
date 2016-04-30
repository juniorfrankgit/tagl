package fr.imag.tagl.redis;

import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import redis.clients.jedis.Jedis;

public class RedisServer {
	private final Jedis jedis = new Jedis("127.0.0.1", 6379);
	private ArrayList<String> list;
	private JSONObject tmp;
	JSONParser parser;
	
	public synchronized Long put(String student) {
		return jedis.rpush("students-list", student);
	}
	
	public synchronized String get(String studentNumber){
		tmp = new JSONObject();
		parser = new JSONParser();
		list = (ArrayList<String>)jedis.lrange("students-list", 0, -1);
		for(String s : list){
			try {
				tmp = (JSONObject)parser.parse(s);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(tmp.get("studentNumber")!=null && tmp.get("studentNumber").equals(studentNumber)){
				return s;
			}
		}
		return null;
	}
}
