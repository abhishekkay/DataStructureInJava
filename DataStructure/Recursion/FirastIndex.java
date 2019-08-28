package Recursion;

import java.util.Scanner;

public class FirastIndex {
    public static int firstIndex(int input[] , int x) {
    	return firstIndex(input, x, 0, 0);
    }
    private static int firstIndex(int input[] , int x , int startIndex, int count) {
    	if(startIndex == input.length) {
    		return -1;
    	}
    	int smallAns = firstIndex(input, x, startIndex+1,count);
    	if(input[startIndex] == x) {
    		count = count + 1;
    		return count;
    	}
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
        System.out.println(firstIndex(arr, x));
	}

}
