package TimeandSpaceComplexity;

import java.util.Scanner;

public class CheckArrayRotation {
	public static int arrayRotateCheck(int[] arr){
		int x = 0;
		for(int i = 0 ; i < arr.length - 1 ; i++) {
			if(arr[i] > arr[i+1]) {
				x = i;
				x = x + 1;
				break;
			}
		}
       return x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(arrayRotateCheck(arr));

	}

}
