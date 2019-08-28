package Recursion2;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int input[] , int element) {
    	return binarySearch(input, element, 0, input.length - 1);
    }
    public static int binarySearch(int input[] , int element , int start , int end) {
    	if(start > end) {
    		//System.out.println(start+" "+end);
    		return -1;
    	}
    	int mid = (start + end) / 2;
    	if(input[mid] == element) {
    	    return mid;
    	}
    	if(input[mid] > element) {
    		return binarySearch(input, element, start, mid-1);
    	}else{
    		return binarySearch(input, element, mid+1, end);
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
		int element = sc.nextInt();
        int output = binarySearch(arr, element);
        System.out.println(output);
	}

}
