package Recursion;

import java.util.Scanner;

public class PMI {
    public static int sum(int n) {
    	if(n == 1) {
    		return 1;
    	}
        return n + sum(n-1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(sum(n));

	}

}
