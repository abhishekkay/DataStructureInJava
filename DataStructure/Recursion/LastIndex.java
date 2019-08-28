package Recursion;

import java.util.Scanner;

public class LastIndex {
    public static int lastIndex(int input[] , int x) {
    	return lastIndex(input, x, 0);
    }
    private static int lastIndex(int input[] , int x , int startIndex) {
    	if(startIndex == input.length) {
    		return -1;
    	}
      	int smallAns = lastIndex(input, x, startIndex+1);
    	//System.out.println(smallAns+" "+x+" "+startIndex);
      	if(smallAns == -1 && input[startIndex] == x) {
      		return startIndex;
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
		System.out.println(lastIndex(arr, x));
	}

}
