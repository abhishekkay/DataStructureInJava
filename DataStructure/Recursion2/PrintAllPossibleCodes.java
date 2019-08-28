package Recursion2;

import java.util.Scanner;

public class PrintAllPossibleCodes {
    public static void printAllPossibleCodes(String input) {
    	printAllPossibleCodes(input, "");
    }
    public static void printAllPossibleCodes(String input , String outputSoFar) {
    	if(input.length() == 0) {
    		System.out.println(outputSoFar);
    		return;
    	}
    	int firstChar = (input.charAt(0) - '0');
    	char first = (char)('a' + firstChar - 1);
    	printAllPossibleCodes(input.substring(1), outputSoFar+first);
        if(input.length() >= 2) {
        int firstTwoDigit = (input.charAt(0) - '0') * 10 + (input.charAt(1) - '0');
        if(firstTwoDigit >= 10 && firstTwoDigit <= 26) {
          char second = (char) ('a' + firstTwoDigit - 1);         
          printAllPossibleCodes(input.substring(2), outputSoFar+second);
        }
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		printAllPossibleCodes(input);

	}

}
