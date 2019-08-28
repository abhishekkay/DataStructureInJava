package Recursion2;

import java.util.Scanner;

public class MergeSort {
    public static void mergeSort(int input[]) {
    	mergeSort(input, 0, input.length-1);
//    	for(int i = 0 ; i < input.length ; i++) {
//    		System.out.print(input[i]+" ");
//    	}
    }
    public static void mergeSort(int input[] , int SI , int EI) {
    	if(SI < EI) {
    	int mid = (SI + EI)/2;
    	//System.out.println(mid+" "+SI+" "+EI);
    	mergeSort(input, SI, mid);
    	mergeSort(input, mid+1, EI);
        merge(input, mid, SI, EI);
    	}
    }
    public static void merge(int input[] , int mid , int SI , int EI) {
         int n1 = mid;
         int n2 = EI;
         int i = SI , j = mid+1 , k = 0;
         int output[] = new int[EI - SI + 1];
        // System.out.println(" mid=>"+mid+" SI=>"+SI+" EI=>"+EI+" input=>"+input.length+" output=>"+output.length);

         while(i <= n1 && j <= n2 ) {
        	 if(input[i] <= input[j]) {
        		  output[k] = input[i];
        		  i++;
        		  k++;
        	 }else {
        		  output[k] = input[j];
        		  j++;
        		  k++;
        	 }
         }
         while(i <= n1) {
        	 output[k] = input[i];
        	 i++;
        	 k++;
         }
         while(j <= n2) {
        	 output[k] = input[j];
        	 j++;
        	 k++;
         }
         for(int x = SI ; x <= EI ; x++) {
        	 input[x] = output[x - SI];
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
       mergeSort(input);
//       for(int i = 0 ; i < n ; i++) {
//    	   System.out.print(input[i]+" ");
//	}
	}
}
