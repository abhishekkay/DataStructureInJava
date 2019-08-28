package Recursion;

import java.util.Scanner;

public class CheckPalindrome {
    public static boolean  isStringPalindrome(String input) {
    	if(input.length() <= 1) {
    		return true;
    	}else {
        	return helper(input , 0 , input.length() - 1);	
    	}
    }
    public static boolean helper(String input , int startIndex , int endIndex) {
    	if(startIndex == endIndex) {
    		return true;
    	} 
    	if(input.charAt(startIndex) != input.charAt(endIndex)) {
    		return false;
    	}
    	if(startIndex < endIndex+1)
    		 helper(input, startIndex+1, endIndex-1);
    	
    	return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(input.substring(1,input.length() - 1).length());
		//System.out.println(input.length());
		//System.out.println(isStringPalindrome(input));

	}

}
