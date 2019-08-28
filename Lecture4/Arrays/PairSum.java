package Arrays;

import java.util.Scanner;


import java.util.Arrays;
public class PairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	       int n = sc.nextInt();
	       int arr[] = new int[n];
	       for(int i = 0 ; i < n ; i++) {
	    	   arr[i] = sc.nextInt();
	       }
	       int num = sc.nextInt();
	      // Arrays.sort(arr);
	       for(int i = 0 ; i < n -1 ; i++) {
	    	   for(int j = i +1 ; j < n ; j++) {
	    		   if(arr[i]+arr[j] == num) {
	    			   if(arr[i]<arr[j]) {
	    				   System.out.println(arr[i]+" "+arr[j]);
	    			   }else {
	    				   System.out.println(arr[j]+" "+arr[i]);
	    			   }
	    		   }    		   
	    	   }
	       }
	}

}
