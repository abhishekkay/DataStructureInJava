package Recursion;

import java.util.Scanner;

public class StairCase {
    public static int staircase(int n) {
    	if(n < 0) {
    		return 0;
    	}
    	int count = 0;
    	if(n == 0) {
    		return count+1;
    	}
    	int x = staircase(n-1);
    	int y = staircase(n-2);
    	int z = staircase(n-3);
    	return x+y+z;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(staircase(n));

	}

}
