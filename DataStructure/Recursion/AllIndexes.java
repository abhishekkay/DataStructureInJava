package Recursion;

import java.util.Scanner;

public class AllIndexes {
    public static int[] allIndexes(int input[] , int x) {
    	return allIndexes(input, x, 0);
    }
    public static int[] allIndexes(int input[] , int x , int  startIndex) {
       if(startIndex == input.length) {
    	   int output[] = new int[0];
    	   return output;
       }
       int smallOuput[] = allIndexes(input, x, startIndex+1);
       if(input[startIndex] == x) {
    	   int output[] = new int[smallOuput.length + 1];
    	   output[0] = startIndex;
    	   System.out.println(startIndex);
    	    for(int i = 0 ; i < smallOuput.length ; i++) {
    	    	output[i+1] = smallOuput[i];
    	    }
    	    return output;
       }
       else {
    	   return smallOuput;
       }
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
		int input[] = allIndexes(arr, x);
		for(int i = 0 ; i < input.length ; i++) {
			System.out.print(input[i]+" ");
		}

	}

}
