package com.globallogic.day10;

import java.util.Map;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.LinkedHashMap;


//key should not have null value
//list and set can hold one type of data 
// map can hold both
// key & value
// name & roll number
// name & number
//
//
//
public class MyMap {
	public static void main(String[] args) {
		// hashtable- will not maintain the order & is thread safe
		// hashmap- is not thread safe
		//linkedhashmap- will maintain the order 
		// Treemap- store data in sorted manner
		Map<String, Integer> map=new TreeMap<String, Integer>();
		map.put("Rachel", 1);
		map.put("Chandler", 3);
		map.put("Ross", 2);
		map.put("Joe", 6);
		map.put("Monica", 5);
		map.put("Phoebe", 4);
		//return true if contains key 
		map.containsKey("Monica");
		map.containsValue(11);
		System.out.println(map);
		Set<String> keys= map.keySet();
		for(String key: keys) {
			System.out.println("keys "+ key+ "value "+ map.get(key));
			//one value a  time
			//System.out.println(map.get("Chandler"));
			
			//entry set is interface which has the get-key and key-value method is there
		}
		for(Map.Entry<String,Integer> entry: map.entrySet()) {
			//System.out.println("Key "+entry.getKey() +" value "+entry.getValue());

		}
		
	}
	

}
