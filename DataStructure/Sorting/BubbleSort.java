package Sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void bubblesort(int input[]) {
    	int n = input.length;
    	int temp = 0;
    	for(int i = 0 ; i < n - 1 ; i++) {
    		for(int j = 0 ; j < n - i - 1 ; j++) {
    			if(input[j] > input[j+1]) {
    				temp = input[j];
    				input[j] = input[j+1];
    			   input[j+1] = temp;
    			}
    		}
    	}
    	for(int i = 0 ; i < n ; i++) {
			System.out.print(input[i]+" ");
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int input[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			input[i] = sc.nextInt();
		}
		bubblesort(input);
		

	}

}
