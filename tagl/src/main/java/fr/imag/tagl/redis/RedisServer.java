package fr.imag.tagl.redis;

import java.util.ArrayList;

import org.json.simple.JSONObject;

import redis.clients.jedis.Jedis;

public class RedisServer {
	private final Jedis jedis = new Jedis("127.0.0.1", 6379);
	private ArrayList<String> list;
	private JSONObject o = new JSONObject();
	
	public RedisServer(){
		o.put("ddd", "dfff");
		o.put("rrr", "ttt");
	}
	
	public synchronized void put(String student) {
		jedis.rpush("students-list", student);
	}
	
	public synchronized String get(String studentNumber){
		list = (ArrayList<String>)jedis.lrange("students-list", 0, -1);
		
		for(String s : list){
			if(s.contains(studentNumber)){
				return s;
			}
		}
		return null;
	}
}
