package StringPractice;

import java.util.Arrays;
import java.util.Scanner;

public class CheckPermutation {
	public static boolean isPermutation(String input1, String input2) {
	    // Write your code here
		int arr[] = new int[256];
		//Arrays.fill(arr, 0);
		if(input1.length() != input2.length()) {
			return false;
		}
		int i = 0 , j = 0;
		char a ;
		while(i < input1.length()) {
			arr[input1.charAt(i)]++;
			i++;
		}
		while(j < input2.length()) {
			arr[input2.charAt(j)]--;
			j++;
		}
		for(i = 0 ; i < arr.length ; i++) {
			if(arr[i] !=0) {
				return false;
			}
		}
        return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println(isPermutation(s1, s2));

	}

}
