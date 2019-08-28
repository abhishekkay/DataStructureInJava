package AssignmentRecursion1B;

import java.util.Scanner;

public class PairStar {
    public static String addStars(String input) {
    	String output = "";
    	if(input.length() <= 1) {
    		return input;
    	}
    	String small = addStars(input.substring(1));
    	//System.out.println(input.length());
    	if(input.charAt(0)==small.charAt(0)) {
    		output = input.charAt(0)+"*"+small;
    	}else {
    		output = input.charAt(0)+small;
    	}
    	return output;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String  s1 = sc.nextLine();
		System.out.println(addStars(s1));

	}

}
