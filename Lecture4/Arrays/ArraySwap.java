package Arrays;

import java.util.Scanner;


public class ArraySwap {
    public static int[] swap(int input[]) {
    	int l = input.length;
    	int i = 0;
    	int j = i+1;
    	int temp = 0;
    	while(i < l-1) {
    		temp = input[i];
    		input[i] = input[j];
    		input[j] = temp;
    		i = i + 2;
    		j = i + 1;
    	}
    	return input;
    }
    public static void printArr(int arr[]) {
    	for(int i = 0 ; i < arr.length ; i++) {
    		System.out.print(arr[i] + " ");
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
		int b[] = swap(arr);
		printArr(b);
	}

}
