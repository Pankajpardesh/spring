package Hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashIteration {
		public static void main(String[] args) {
			HashMap<Integer, String> map=new HashMap<Integer,String>();
			map.put(2, "Pankaj");
			map.put(3, "raja");
			map.put(4, "King");
		System.out.println(map.size());
		System.out.println(map);	
		Iterator itr=map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry me=(Map.Entry)itr.next();
			System.out.println(me.getKey()+" "+" "+me.getValue());
		}
		for(Map.Entry me : map.entrySet()) {
			System.out.println(me.getKey()+" "+me.getValue());
		}
		
		}
}
