package TimeandSpaceComplexity;

import java.util.Scanner;

public class RotateArray {
	public static void rotate(int[] arr, int d) {
		int n = arr.length;
		int temp[] = new int[d];
		for(int i = 0 ; i < d ; i++) {
			temp[i] = arr[i];
		}
		int x = d;
		int j = 0;
		for(int i = 0 ; i < (n - d) ; i++) {
			if(x < n )
			arr[i] = arr[x];
			x++;
		}
		x  = (n-d);
		for(int i = 0 ; i < d ; i++) {
			if(x < n)
			arr[x] = temp[i];
			x++;
		}
		for(int i = 0 ; i < n ; i++) {
			System.out.print(arr[i]+" ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		int d = sc.nextInt();
		rotate(arr, d);

	}

}
