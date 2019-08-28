package TimeandSpaceComplexity;

import java.util.Scanner;
import java.util.Arrays;
public class PairSum {
	public static void pairSum(int[] arr, int num){
		Arrays.sort(arr);
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = i + 1 ; j < arr.length ; j++) {
				if(arr[i] + arr[j] == num) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
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
		int num = sc.nextInt();
		pairSum(arr, num);
		

	}

}
