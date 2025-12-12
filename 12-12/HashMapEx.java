package com.a1212;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx 
{
	public static void main(String[] args) 
	{
		HashMap map = new HashMap();
		
		map.put("java", "priyanshu");
		map.put("php", "vipul");
		
		 Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
		 
		  while (iterator.hasNext()) 
		  {
	            // Get the next entry (key-value pair)
	            Map.Entry<String, String> entry = iterator.next();

	            // 4. Get the key and the value from the entry
	            String key = entry.getKey();
	            String value = entry.getValue();

	            System.out.println("Key: " + key + ", Value: " + value);
	        }
	}
}
