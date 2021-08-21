package Reverse;

public class SecondHighestNo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 21, 32, 54, 878, 14, 5 };
		int largest = 0;
		int secondlargest = 0;
		for (Object a : arr) {
			System.out.print(a + " ");
		}
		for (int i = 0; i < arr.length; i++) {
				if (arr[i] >largest) {
					secondlargest=largest;
					largest=arr[i];
				}
				else if(arr[i]>secondlargest){
					secondlargest=arr[i];
					
				}
				
		}System.out.println("largest:"+largest+" secondLargest: "+secondlargest);
	}
}
