package Practice;

import java.util.Scanner;

public class Find2ndLargest {
	public static int secondLargestElement(int[] arr) {
		int first , second , i;
		first = second = Integer.MIN_VALUE;
		for( i = 0 ; i  <arr.length;i++) {
		     if(arr[i]>first) {
		    	 second = first;
		    	 first = arr[i];
		     }
		     else if(arr[i]>second && arr[i] != first) {
		    	 second = arr[i];
		     }
		}
		return second;
     
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++ ) {
			arr[i] = sc.nextInt();
		}
        int sec = secondLargestElement(arr);
        System.out.println(sec);
	}

}
