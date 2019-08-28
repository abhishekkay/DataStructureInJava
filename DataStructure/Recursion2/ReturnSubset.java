package Recursion2;

import java.util.Scanner;

public class ReturnSubset {
    public static int[][] subsets(int input[]){
    	return subsets(input, 0);
    }
    public static int[][] subsets(int input[] , int start){
    	if(input.length == start) {
    		int arr[][] = new int[1][0];
    		//arr[1][1] = 0;
    		return arr;
    	}
    	int cn = input[start];
    	int smalloutput[][] = subsets(input,start+1);
    	int k = 0;
    	int output[][] = new int[2*smalloutput.length][];
    	for(int i = 0 ; i < smalloutput.length ; i++) {
    		output[k] = new int[smalloutput[i].length];
    		for(int j = 0 ; j < smalloutput[i].length ; j++) {
    			output[k][j] = smalloutput[i][j];
    		}
    		k++;
    	}
    	for(int i = 0 ; i < smalloutput.length ; i++) {
    		output[k] = new int[smalloutput[i].length+1];
    		output[k][0] = cn;
    		for(int j = 1 ; j <= smalloutput[i].length ; j++) {
    			output[k][j] = smalloutput[i][j-1];
    		}
    		k++;
    	}
    	return output;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int input[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			input[i] = sc.nextInt();
		}
		int output[][] = subsets(input);
        for(int i = 0 ; i < output.length ; i++) {
        	for(int j = 0 ; j < output[i].length ; j++) {
        		System.out.print(output[i][j]+" ");
        	}
        	System.out.println();
	}
//		int outputarr[] = restructure(input);
//		for(int i = 0 ; i < outputarr.length ; i++) {
//			System.out.print(outputarr[i]+" ");
//        }
	}

}
