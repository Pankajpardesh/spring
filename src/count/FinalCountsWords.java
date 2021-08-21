package count;

import java.util.HashMap;

public class FinalCountsWords {
	public static void main(String args[]) {
		String str="this is is is the main purpose";
		String[] split =str.split(" ");
		
		HashMap<String,Integer>map=new HashMap<String,Integer>();
		for(int i=0;i<split.length;i++) {
			if(map.containsKey(split[i])){
				int count=map.get(split[i]);
				map.put(split[i],count+1);
				System.out.println(split[i]);
				System.out.println(count);
			}
			else {
				map.put(split[i], 1);
			}
		}
		System.out.println(split);
		System.out.println(map);
	}
	
}
