package StringPractice;

import java.util.Scanner;

public class ReverseEachWord {
	public static String reverseEachWord(String input) {
		// Write your code here
		String s[] = input.split(" ");
		String output = "";
		for(int i = 0 ; i < s.length ; i++) {
			for(int j = s[i].length() - 1 ; j >= 0 ; j--) {
				output+=s[i].charAt(j);
			}
			output+=" ";
		}
		return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(reverseEachWord(input));
		//reverseEachWord(input);

	}

}
