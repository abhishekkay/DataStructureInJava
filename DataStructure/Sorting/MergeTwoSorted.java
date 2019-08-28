package Sorting;

import java.util.Scanner;

public class MergeTwoSorted {
    public static int[] mergeArrays(int arr1[] , int arr2[]) {
    	int n = arr1.length;
    	int m = arr2.length;
    	int arr3[] = new int[n+m];
        int i = 0 , j = 0 , k = 0;
        while(i < n && j < m) {
        	if(arr1[i] < arr2[j] )
        		arr3[k++] = arr1[i++];
        	else 
        		arr3[k++] = arr2[j++];        	
        }
        while(i < n) {
        	arr3[k++] = arr1[i++];
        }
        while(j < m) {
        	arr3[k++] = arr2[j++];
        }
    	return arr3;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr1[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr1[i] = sc.nextInt();
		}
        int m = sc.nextInt();
        int arr2[] = new int[m];
        for(int i = 0 ; i < m ; i++) {
        	arr2[i] = sc.nextInt();
        }
        int arr3[] = mergeArrays(arr1, arr2);
        for(int i = 0 ; i < arr3.length ; i++) {
        	System.out.print(arr3[i]+" ");
        }
        
	}

}
