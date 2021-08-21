package Reverse;

public class ArrayList {
	public static boolean isPresent(int[] array,int number) {
		
		for(int i=0;i<=array.length;i++) {
			if(array[i]==number) {
				return true;
			}
		}
		return false;
	} 
	public static void main(String args[]) {
		int[] array= {10,20,30};
		int number=20;
		System.out.println(number+" is Found in index its "+isPresent(array,number));
	}
}
