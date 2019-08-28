package Strings;

import java.util.Scanner;

public class ReverseString {
    public static String reverseWordWise(String str) {
    	String result = "";
    	int i = str.length() - 1;
    	int end = str.length();
    	while(i >= 0) {
    		if(str.charAt(i)==' ') {
    			result+=str.substring(i+1,end)+" ";
    			end = i;
    		}
    		i--;
    	}
    	result+=str.substring(i+1,end);
    	return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new  Scanner(System.in);
       String str = sc.nextLine();
       String s = reverseWordWise(str);
       System.out.println(s);
       
	}

}
