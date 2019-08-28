package Recursion;

import java.util.Scanner;

public class Power {
	/*static int power = 1;
    public static int power(int x , int n) {
    	if(n == 0) {
    		return 1;
    	}
         power *= x;
    	//System.out.println(power);
    	power(x,n-1);
    	return power;
    }
    */
    public static int power(int x , int n) {
    	if(x == 0 && n == 0)
    		return 0;
    	if(x == 0)
    		return 0;
    	if(n == 0)
    		return 1;
    	int smallAns = power(x , n / 2);
    	System.out.println(smallAns);
    	if(n%2 == 0) {
    		return smallAns * smallAns;
    	}
    	else {
    		return x * smallAns * smallAns; 
    	}
    		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(power(x, n));

	}

}
