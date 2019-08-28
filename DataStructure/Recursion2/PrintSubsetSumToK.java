package Recursion2;

import java.util.Scanner;

public class PrintSubsetSumToK {
    public static void printSubsetsSumTok(int input[] , int k) {
    	int output[] = new int[0];
    	printSubsetsSumTok(input, k, output , 0);
    }
    public static void printSubsetsSumTok(int input[] , int k , int output[] , int startIndex) {
    	if(startIndex == input.length) {
    		if(k == 0) {
    			for(int i = 0 ; i < output.length ; i++) {
    				System.out.print(output[i]+" ");
    			}
    			System.out.println();
    			return;
    		}else {
    			return;
    		}
    	}
    	int newoutput[] = new int[output.length+1];
    	int i = 0;
    	for(i = 0 ; i < output.length ; i++) {
    		newoutput[i] = output[i];
    	}
    	newoutput[i] = input[startIndex];
    	printSubsetsSumTok(input, k, output, startIndex+1);
    	printSubsetsSumTok(input, k-input[startIndex], newoutput, startIndex+1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
        int k = sc.nextInt();
        printSubsetsSumTok(arr, k);
	}

}
