package Recursion2;

import java.util.Scanner;


public class ReturnAllCodes {
    public static String[] getCode(String input) {
    	if(input.length() == 0) {
    		String ans[] = {""};
    		return ans;
    	}
    	int firstChar = (input.charAt(0) - '0');
    	String smallans1[] = getCode(input.substring(1));
    	String smallans2[] = new String[0];
    	int firstTwoDigit = 0;
    	if(input.length() >= 2) {
    	    firstTwoDigit = (input.charAt(0) - '0') * 10 + (input.charAt(1) - '0');
    	    if(firstTwoDigit >= 10 && firstTwoDigit <= 26) {
    	    	smallans2 = getCode(input.substring(2));
    	    }
    	}
    	String smallAns[] = new String[smallans1.length + smallans2.length];
    	int k = 0;
    	for(int i = 0 ; i < smallans1.length ; i++) {
    		int first = 'a' + firstChar - 1;
    		char firstCh = (char) first;
    		smallAns[k] = firstCh + smallans1[i];
    		k++;
    	}
    	for(int i = 0 ; i < smallans2.length ; i++) {
    		int second = 'a' + firstTwoDigit - 1;
    		char secondCh = (char) second;
    		smallAns[k] = secondCh + smallans2[i];
    		k++;
    	}
    	return smallAns;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String output[] = getCode(input);
		for(String i : output) {
			System.out.println(i);
		}

	}

}
