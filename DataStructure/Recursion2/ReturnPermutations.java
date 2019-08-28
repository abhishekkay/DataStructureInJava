package Recursion2;

import java.util.Scanner;

public class ReturnPermutations {
	public static String[] permutationOfString(String input){
		// Write your code here
		if(input.length() == 0) {
			String myAns[] = {""};
			return myAns;
		}
		char ch = input.charAt(0);
		String[] smallAns = permutationOfString(input.substring(1));
		String myAns[] = new String[input.length() * smallAns.length];
		int k = 0;
		for(int i = 0 ; i < smallAns.length ; i++) {
			String currString = smallAns[i];
			//System.out.println(currString);
			for(int j = 0 ; j <= currString.length() ; j++) {
				String ans1 = currString.substring(0, j);
				String ans2 = currString.substring(j);
				myAns[k] = ans1+ ch + ans2;
				//System.out.println(myAns[k]+" "+myAns.length);
				//System.out.println(ans1+" "+ans2);
				k++;
			}
		}
		return myAns;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
	    //String output[] = permutationOfString(input);
//	    for(String s : output) {
//	    	System.out.println(s);
//	    }
	    //System.out.println(input.substring(1));

	}

}
