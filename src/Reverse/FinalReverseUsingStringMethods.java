package Reverse;

public class FinalReverseUsingStringMethods {
	public static void main(String args[]) {
		String str="Automation";
		String reverse="";
		char[] try1 =str.toCharArray();
		
		for(int i=try1.length-1;i>=0;i--) {
			System.out.print(try1[i]);
		
			reverse=reverse+str.charAt(i);
		}
		
		System.out.println();
		System.out.println(reverse);
	}
}