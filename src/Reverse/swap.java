package Reverse;

public class swap {

	public static void main(String args[]) {
		
		String str="Paj";
		char[] array=str.toCharArray();
		int left,right=0;
		right=array.length-1;
		for(left=0;left<right;left++,right++) {
			char temp=array[left];
			array[left]=array[right];
			array[right]=temp;
		}
		for(char c:array)
			System.out.println(c);
	}
}
