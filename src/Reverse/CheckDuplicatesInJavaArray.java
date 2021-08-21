package Reverse;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckDuplicatesInJavaArray {

    public static void main(String args[])  {
       
       String[] withDuplicates = new String[] {"one","two","three","one"};
        String[] withoutDuplicates = new String[] {"one","two","three"};
      
        System.out.println("Checking array with duplicate using brute force: " + bruteforce(withDuplicates));
        System.out.println("Checking array without any duplicate using brute force: " + bruteforce(withoutDuplicates));
      
//        System.out.println("Checking array with duplicate using Set and List: " + checkDuplicateUsingSet(withDuplicates));
//        System.out.println("Checking array without any duplicate using Set and List: " + checkDuplicateUsingSet(withoutDuplicates));

      
        System.out.println("Checking array with duplicate using Set and List: " + checkDuplicateUsingAdd(withDuplicates));
        System.out.println("Checking array without any duplicate using Set and List: " + checkDuplicateUsingAdd(withoutDuplicates));
   }
    public static boolean bruteforce(String[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (input[i].equals(input[j]) && i != j) {
                    return true;
                }
            }
        }
        return false;
    }
//    public static boolean checkDuplicateUsingSet(String[] input){
//        List inputList = Arrays.asList(input);
//        Set inputSet = new HashSet(inputList);
//        if(inputSet.size()< inputList.size())
//            return true;
//        }
//        return false;
//	}
    public static boolean checkDuplicateUsingAdd(String[] input) {
        Set tempSet = new HashSet();
        for (String str : input) {
            if (!tempSet.add(str)) {
                return true;
            }
        }
        return false;
    }
}
