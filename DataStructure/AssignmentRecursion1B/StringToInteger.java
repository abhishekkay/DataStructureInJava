package AssignmentRecursion1B;

import java.util.Scanner;

public class StringToInteger {
    public static int convertStringToInt(String input) {
    	if(input.length() == 1) {
    		return input.charAt(0) - '0';
    	}
    	int smallOutput = convertStringToInt(input.substring(0,input.length()-1));
    	//System.out.println(input);
    	int lastDigit = input.charAt(input.length() - 1)-'0';
    	return smallOutput*10+lastDigit;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(convertStringToInt(input));

	}

}
