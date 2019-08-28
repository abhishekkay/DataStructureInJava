package Recursion;

import java.util.Scanner;

public class Multiplication {
    public static int multiplyTwoIntegers(int m , int n) {
    	if(n <= 0) {
    		return 0;
    	}
    	int smallans = multiplyTwoIntegers(m, n-1);
    	return m+smallans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(multiplyTwoIntegers(m, n));
	}

}
