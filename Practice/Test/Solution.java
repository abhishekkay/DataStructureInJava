package Test;

import java.util.Scanner;

public class Solution {
    public static boolean checkSequence(String a , String b) {
    	if(b.length() == 0) {
    		return true;
    	}
    	if(a.length() == 0) {
    		return false;
    	}
    	if(a.charAt(1) == b.charAt(1)) {
    		return  checkSequence(a.substring(1), b.substring(1));
    	}else {
    		return checkSequence(a.substring(1), b);
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println(checkSequence(s1, s2));

	}

}
