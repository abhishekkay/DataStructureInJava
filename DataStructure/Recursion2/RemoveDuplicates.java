package Recursion2;

import java.util.Scanner;

public class RemoveDuplicates {
	public static String removeConsecutiveDuplicates(String s) {
		String output;
		if(s.length() <= 1) {
			return s;
		}
		String smallAns = removeConsecutiveDuplicates(s.substring(1));
		if(s.charAt(0) == smallAns.charAt(0)) {
			output = smallAns;
		}else {
			output = s.charAt(0)+smallAns;
		}
         return output; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(removeConsecutiveDuplicates(s));

	}

}
