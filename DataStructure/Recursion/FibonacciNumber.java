package Recursion;

import java.util.Scanner;

public class FibonacciNumber {
    public static int fib(int n) {
    	if(n == 0 || n == 1) {
    		return n;
    	}
    	int a = fib(n-1);
    	int b = fib(n-2);
    	//System.out.println(a+" "+b);
    	return a + b;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
	}

}
