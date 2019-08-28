package Recursion;

import java.util.Scanner;

public class CheckNumber {
     public static boolean checkNumber(int input[], int x) {
	      if(input.length == 0) {
	    	  return false;
	      }
	     if(input[0] == x) {
		    	  return true;
		      }
	    int temp[] = new int[input.length - 1];
	    for(int i = 1 ; i < input.length ; i++) {
	    	temp[i - 1] = input[i];
	    }
		boolean smallAns = checkNumber(temp, x);
		//System.out.println(smallAns+" "+input.length);
		return smallAns;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
       // System.out.println(checkNumber(arr, x)); 
	}

}
