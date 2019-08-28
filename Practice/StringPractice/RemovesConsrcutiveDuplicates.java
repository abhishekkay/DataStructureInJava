package StringPractice;

import java.util.Scanner;

public class RemovesConsrcutiveDuplicates {
	public static String removeConsecutiveDuplicates(String input) {
	    // Write your code here
		String output = "";
		output+=input.charAt(0);
		for(int i = 1 ; i < input.length() ; i++) {
			if(input.charAt(i-1) != input.charAt(i)) {
				output+=input.charAt(i);
			}
		}
		return output;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(removeConsecutiveDuplicates(input));

	}

}
