package Arrays;

import java.util.Scanner;

public class FindUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
//		int brr[] = new int[10000];		
      	for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
//			brr[arr[i]]++;
     	}
//       for(int j = 0 ; j < brr.length ; j++) {
//    	   if(brr[j] == 1) {
//    		   System.out.println(brr[j]);
//    		   return;
//    	   }
//       }
		int cnt;
		for(int i = 0 ; i < n ; i++) {
			cnt = 0;
			for(int j = 0 ; j < n ; j++) {
				if(arr[i] == arr[j]) {
					cnt++;
				}
			}
			if(cnt >= 2) {
				System.out.println(arr[i]);
				return;
			}
		}
	}

}
