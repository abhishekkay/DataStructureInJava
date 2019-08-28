package SearchingandSort;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++) {
        	arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        int start = 0 , end = n-1;
        while(start<end) {
            int mid = (start + end)/2;
            if(arr[mid] < num) {
                start = mid+1;
            }else if(arr[mid] > num) {
            	end = mid-1;
            }else if(arr[mid] == num) {
            	System.out.println(1);
            	return;
            }
        }
        System.out.println(-1);
	}
}
