package StringPractice;

import java.util.Scanner;

public class RemoveCharacter {
	public static String removeAllOccurrencesOfChar(String input, char c) {
	    // Write your code here
		String out ="";
		for(int i = 0 ; i < input.length() ; i++) {
			if(input.charAt(i) != c) {
				out+=input.charAt(i);
			}
		}
		return out;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char c = sc.next().charAt(0);
	    System.out.println(removeAllOccurrencesOfChar(s, c));
	}

}
