package Recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static int sumofDigits(int input) {
    	if(input == 0) {
    		return 0;
    	}
    	int smallAns = sumofDigits(input/10) + (input % 10);
       return smallAns;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        System.out.println(sumofDigits(n));
	}

}
