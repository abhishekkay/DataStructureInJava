package Recursion;

import java.util.Scanner;

public class CheckSorted {
    public static boolean checksorted(int input[]) {
    	if(input.length <= 1) {
    		return true;
    	}
    	int smallInput[] = new int[input.length - 1];
    	for(int i = 1 ; i < input.length ; i++ ) {
    		smallInput[i-1] = input[i];
    	}
    	boolean smallAns = checksorted(smallInput);
    	if(!smallAns) {
    		return false;
    	}
    	if(input[0] <= input[1]) {
    		return true;
    	}else {
    		return false;
    	}
    }
    public static boolean checksorted_2(int input[]) {
    	if(input.length <= 1) {
    		return true;
    	}
    	if(input[0] > input[1]) {
    		//System.out.println(input.length);
    		return false;
    	}
    	int smallInput[] = new int[input.length - 1];
    	for(int i = 1 ; i < input.length ; i++ ) {
    		smallInput[i-1] = input[i];
    	}
    	boolean smallAns = checksorted_2(smallInput);
       // System.out.println(smallAns+" "+smallInput.length+" "+input[0]);
    	return smallAns;
    }
    //This function checks if the array is sorted from startIndex to end
    private static boolean checkSortedBetter(int input[] , int startIndex) {
    	if(startIndex >= input.length - 1) {
    		return true;
    	}
    	if(input[startIndex] > input[startIndex+1]) {
    		return false;
    	}
    	boolean smallAns = checkSortedBetter(input, startIndex+1);
    	return smallAns;
    }
    public static boolean checkSortedBetter(int input[]) {
    	return checkSortedBetter(input, 0);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
      //System.out.println("IsSorted"+"=>"+checksorted(arr));
     // System.out.println("IsSorted"+"=>"+checksorted_2(arr));
		System.out.println("IsSorted"+"=>"+checkSortedBetter(arr));
	}

}
