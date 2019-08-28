package Sorting;

import java.util.Scanner;

public class RotateArray {
    public static void rotate(int arr[],int d) {
    	int n = arr.length;
    	int i = 0 , j = 0;
    	for(i = 0 ; i < d ; i++) {
    		int temp =arr[0];
    		for( j = 0 ; j < n - 1 ; j++) {
    			arr[j] = arr[j+1];
    		}
    		arr[j] = temp;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i<n ; i++) {
        	arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        rotate(arr, d);
        for(int i = 0 ; i < n ; i++) {
        	System.out.print(arr[i]+" ");
        }
	}

}
