package TimeandSpaceComplexity;

import java.util.Scanner;

public class DuplicateArray2 {
	public static int duplicate(int[] arr){  
		int x = arr.length;
		int sum = 0;
		for(int i = 0 ; i < x ; i++) {
			sum += arr[i];
		}
		int n = x - 2;
		int sumofn = (n*(n+1))/2;
		//int result = (int)(sum - sumofn);
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
       System.out.println(duplicate(arr));

	}

}
