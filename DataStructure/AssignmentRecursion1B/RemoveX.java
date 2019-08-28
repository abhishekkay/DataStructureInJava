package AssignmentRecursion1B;

import java.util.Scanner;

public class RemoveX {
    public static String removeX(String input) {
    	String output;
    	if(input.length() < 1) {
    		return input;
    	}
    	String small = removeX(input.substring(1));
    	if(input.charAt(0) == 'x'){
    		output=""+small;
    	}else {
    		output = input.charAt(0)+small;
    	}
    	return output;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(removeX(s));

	}

}
