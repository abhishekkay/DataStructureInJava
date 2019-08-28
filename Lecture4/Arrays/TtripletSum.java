package Arrays;

import java.util.Scanner;

public class TtripletSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++) {
        	arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        for(int i = 0 ; i < n ; i++) {
        	for(int j = i + 1 ; j < n ; j++) {
        		for(int k = j + 1 ; k < n ; k++) {
        			if(arr[i]+arr[j]+arr[k] == num) {
        				if((arr[i] <= arr[j]) && (arr[i] <= arr[k]) && (arr[j]<=arr[k])) {
        					System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
        				}else if((arr[j] <= arr[i]) && (arr[j] <= arr[k]) && (arr[i] <= arr[k])){
        					System.out.println(arr[j]+" "+arr[i]+" "+arr[k]);
        				}else if((arr[k] <= arr[i]) && (arr[k] <= arr[j]) && (arr[i] <= arr[j])){
        					System.out.println(arr[k]+" "+arr[i]+" "+arr[j]);
        				}else if((arr[k] <= arr[i]) && (arr[k] <= arr[j]) && (arr[j] <= arr[i])){
        					System.out.println(arr[k]+" "+arr[j]+" "+arr[i]);
        				}else if((arr[j] <= arr[i]) && (arr[j] <= arr[k]) && (arr[k] <= arr[i])){
        					System.out.println(arr[j]+" "+arr[k]+" "+arr[i]);
        				}else if((arr[i] <= arr[j]) && (arr[i] <= arr[k]) && (arr[k] <= arr[j])) {
        					System.out.println(arr[i]+" "+arr[k]+" "+arr[j]);
        				}
        			}
        		}
        	}
        }
	}

}
