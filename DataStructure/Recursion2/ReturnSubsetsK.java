package Recursion2;

import java.util.Scanner;

public class ReturnSubsetsK {
    public static int[][] subsetsSumK(int input[] , int k){
    	return subsetsSumK(input, k, 0);
    }
    public static int[][] subsetsSumK(int input[] , int k , int startIndex){
    	if(startIndex == input.length) {
    		if(k == 0) {
    			int output[][] = new int[1][0];
    			return output;
    		}else {
    			int output[][] = new int[0][0];
    			return output;
    		}
    	}
    	int temp1[][] = subsetsSumK(input, k-input[startIndex], startIndex+1);
    	int temp2[][] = subsetsSumK(input, k, startIndex+1);
    	int output[][] = new int[temp1.length+temp2.length][];
    	int x = 0;
    	for(int i = 0 ; i < temp1.length ; i++) {
    		output[x] = new int[temp1[i].length+1];
    		output[x][0] = input[startIndex];
    		for(int j = 0 ; j < temp1[i].length ; j++) {
    			output[x][j+1] = temp1[i][j];
    		}
    		x++;
    	}
    	for(int i = 0 ; i < temp2.length ; i++) {
    		output[x] = temp2[i];
    		x++;
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
		int k = sc.nextInt();
        int output[][] = subsetsSumK(input, k);
        for(int i = 0 ; i < output.length ; i++) {
        	for(int j = 0 ; j < output[i].length ; j++) {
        		System.out.print(output[i][j]+ " ");
        	}
        	System.out.println();
        }
	}

}
