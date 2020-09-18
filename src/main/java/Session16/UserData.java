package Session16;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class UserData {
	public static void main(String[] args) {
		
		Map<String, String> usermap=new HashMap<String, String>();
		
		usermap.put("id", "1");
		usermap.put("name","Tom");
		usermap.put("city","Bangalore");
		usermap.put(null, "pune");
		usermap.put(null, "hyd");		//one null key is allowed in hashtable i.e (null hyd) latest value
		usermap.put("company", null);
		usermap.put("country", null);		//in map duplicate null allows
		
		System.out.println(usermap.get("id"));
		System.out.println(usermap.size());
		
		for(Map.Entry m: usermap.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
		Hashtable<String, Integer> productTable=new Hashtable<String, Integer>();
		productTable.put("Apple MacBook", 2000);
		productTable.put("windows HP laptop", 1000);
		productTable.put("Apple iphoneX", 1500);
		productTable.put(null, null);		//no null key and null value in hashtable
		
		System.out.println(productTable);
		System.out.println(productTable.get("Apple MacBook"));
		
		for(Map.Entry m: productTable.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
		//Hashmap is non synchronized-not thread safe
	}
	
	
}
