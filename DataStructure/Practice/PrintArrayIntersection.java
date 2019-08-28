package Practice;

import java.util.Scanner;

public class PrintArrayIntersection {
	public static void intersection(int[] arr1, int[] arr2){
	   int len1 = arr1.length;
	   int len2 = arr2.length;
	   if(len1 < len2) {
		   for(int i = 0 ; i < len1 ; i++) {
			   for(int j = i ; j < len2 ; j++ ) {
				   if(arr1[i] == arr2[j])
				   System.out.println(arr1[i]);
				  // break;
			   }
		   }
	   }else {
		   for(int i = 0 ; i < len2 ; i++) {
			   for(int j = i ; j < len1 ; j++ ) {
				   if(arr2[i] == arr1[j])
				   System.out.println(arr2[i]);
				   //break;
			   }
		   }
	   }
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
      intersection(arr1, arr2);
	}

}
