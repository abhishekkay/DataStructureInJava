package TimeandSpaceComplexity;

import java.util.Scanner;
import java.util.*;

public class DuplicateArray {
	public static int duplicate(int[] arr){  
	int n = arr.length;
	Arrays.sort(arr);
	int ele = 0;
	for(int i = 0 ; i < n - 1 ; i++) {
		if(arr[i] == arr[i+1]) {
		ele = i;
		}
	}
	return arr[ele];
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
