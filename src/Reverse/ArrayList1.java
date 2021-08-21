package Reverse;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ArrayList1 {
	public static void main(String[] args) {
		String input="greek for greek";
		char[] hello=input.toCharArray();
		List<Character> l1=new java.util.ArrayList<>();
		for(char c:hello)
			l1.add(c);
		Collections.reverse(l1);
		ListIterator l2=l1.listIterator();
		while(l2.hasNext())
			System.out.print(l2.next());
	}
}
