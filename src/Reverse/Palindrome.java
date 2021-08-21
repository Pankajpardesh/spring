package Reverse;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(str);
		int num=str.length();
		String reverse="";
		int i;
		for (i=num-1;i>=0;i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println(reverse);
		if(str.equals(reverse)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
				
		}
	}
}
