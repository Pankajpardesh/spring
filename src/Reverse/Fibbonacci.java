package Reverse;

import java.util.Scanner;

public class Fibbonacci {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num= in.nextInt();
		int i,a=0,b=0,c=1;
		for (i=0;i<num;i++) {
				a=b;
				b=c;
				c=a+b;
				System.out.print(a+" ");
		}
	}
}
