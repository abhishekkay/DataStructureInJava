package Recursion2;

import java.util.Scanner;

public class CheckAB {	
    public static boolean checkAB(String input) {
    	if(input.length() == 0  ) {
    		return true;
    	}
//    	if(input.charAt(0) != 'a') {
//    		return false;
//    	}
    	if(input.charAt(0) == 'a') {
    	if(input.charAt(1) == 'b' && input.charAt(2) == 'b' ) {
    		return checkAB(input.substring(3));
    	}
    	else {
    		return checkAB(input.substring(1));
    	}
    	}
    	return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
        System.out.println(checkAB(input));
	}
}
