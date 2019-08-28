package Recursion2;

import java.util.Scanner;

public class PrintPermutations {
    public static void permutations(String input) {
     permutations(input, "");
    }
    public static void permutations(String input , String outputSoFar) {
        if(input.isEmpty()) {
        	System.out.println(outputSoFar);
        	return;
        } 
        for(int i = 0 ; i < input.length() ; i++) {
        	//String s = ""+input.charAt(i);
        	//String smallAns = input.replace(s, "");
        	//permutations(smallAns, outputSoFar+input.charAt(i));
          permutations((input.substring(0, i)+input.substring(i+1)), outputSoFar+input.charAt(i));
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		permutations(input);

	}

}
