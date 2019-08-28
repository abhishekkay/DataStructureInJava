package Practice;

import java.util.Scanner;

public class CheckArrayRotation {
	public static int arrayRotateCheck(int[] arr){
		int n = arr.length;
		int min = arr[0];
		int minIndex = 0;
		for(int i = 1; i < n ; i++)
		{
			if(arr[i] < min) {
				min = arr[i];
				minIndex = i;
			}
		}
		return minIndex;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		int minIndex = arrayRotateCheck(arr);
		System.out.println(minIndex);

	}

}
