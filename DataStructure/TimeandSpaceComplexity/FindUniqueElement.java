package TimeandSpaceComplexity;

import java.util.Scanner;

public class FindUniqueElement {

	public static int findUnique(int[] arr){
		int n = arr.length;
		int xor = 0;
		for(int i = 0 ; i < n ; i++) {
			xor = xor ^ arr[i];
		}
       return xor;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
       System.out.println(findUnique(arr));
	}

}
