package Recursion;

import java.util.Scanner;

public class Factorial {
	public int fact(int n) {
		if(n == 0) {
			return 1;
		}
		int smallAns = fact(n-1);
		//System.out.println(smallAns);
		return n * smallAns;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Factorial f = new Factorial();
		System.out.println(f.fact(n));

	}

}
