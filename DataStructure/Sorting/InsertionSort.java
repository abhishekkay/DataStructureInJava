package Sorting;

import java.util.Scanner;

public class InsertionSort {
    
	public static void insertionsort(int[] input) {
		int n = input.length;
		for(int i = 1 ; i < n ; i++) {
			int j = i - 1;
			int key = input[i];
			while(j >= 0 && input[j] > key) {
				input[j+1] = input[j];
				j--;
			}
			//System.out.println(j);
			input[j+1] = key;
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
        insertionsort(arr);
        for(int i = 0 ; i < n ; i++) {
        	System.out.print(arr[i]+" ");
        }
	}

}
