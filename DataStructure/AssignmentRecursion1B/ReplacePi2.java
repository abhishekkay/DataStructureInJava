package AssignmentRecursion1B;

import java.util.Scanner;

public class ReplacePi2 {
    public static String replace(String input) {
    	String output;
    	if(input.length() <= 1) {
    		return input;
    	}
    	String small = replace(input.substring(1));
    	//System.out.println(small);
    	if(input.charAt(0) == 'p' && small.charAt(0)=='i') {
    		output = "3.14" + small.substring(1);
    		//System.out.println(output);
    	}
    	else {
    		output = input.charAt(0) + small;
    	}
    	return output;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		System.out.println(replace(s1));

	}

}
