package Arrays;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] =sc.nextInt();
		}
        int num = sc.nextInt();
        for(int i = 0 ; i < arr.length; i++) {
        	if(arr[i] == num) {
        		System.out.println(i);
        		return;
        	}
        }
        System.out.println("-1");
	}

}
