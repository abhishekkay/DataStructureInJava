package Recursion2;

import java.util.Scanner;

public class ReplaceCharacter {
    public static String replaceCharacter(String input , char c1 , char c2) {
    	String output;
    	if(input.length() == 0) {
    		return input;
    	}
    	String smallAns = replaceCharacter(input.substring(1), c1, c2);
    	if(input.charAt(0) == c1) {
    		output = c2 + smallAns;
    	}else {
    		output = input.charAt(0)+smallAns;
    	}
    	return output;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		char c1 = sc.next().charAt(0);
		char c2 =  sc.next().charAt(0);
		System.out.println(replaceCharacter(input, c1, c2));

	}

}
