package Reverse;
import java.util.ArrayList;
import java.util.Iterator;
 
public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("20");
        list.add("30");
        list.add("40");
        System.out.println(list.size());
        Iterator itr = list.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        for(Object l:list) {
        	System.out.println(l);
        }
        for(int i=0;i<list.size();i++) {
        	System.out.println(list.get(i));
        }

    }
  }