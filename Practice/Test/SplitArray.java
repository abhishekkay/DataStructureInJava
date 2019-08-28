package Test;

import java.util.Scanner;

public class SplitArray {
	public static boolean splitArray(int input[]) {
		return splitArray(input, 0, 0, 0);
		
	}
	public static boolean splitArray(int input[] , int startIndex , int leftSum , int rightSum) {
	if(input.length == startIndex) {
		return leftSum == rightSum;
	}
    if(input[startIndex] % 5 == 0) {
	    leftSum+=input[startIndex];
    }
    if(input[startIndex] % 3 == 0) {
		rightSum+=input[startIndex];
	}
    else {
    	boolean leftAns = splitArray(input, startIndex+1, leftSum+input[startIndex], rightSum);
    	boolean rightAns = splitArray(input, startIndex+1, leftSum, rightSum+input[startIndex]);
    	return leftAns || rightAns;
    	 
    }
    return splitArray(input, startIndex+1, leftSum, rightSum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}

	}

}
