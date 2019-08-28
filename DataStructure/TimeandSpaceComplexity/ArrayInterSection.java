package TimeandSpaceComplexity;

import java.util.Scanner;
import java.util.Arrays;
public class ArrayInterSection {
	public static void intersection(int[] arr1, int[] arr2){
	    int n = arr1.length;
	    int m = arr2.length;
	    Arrays.sort(arr1);
	    Arrays.sort(arr2);
//	    for(int i = 0 ; i < n ; i++) {
//	    	System.out.println(arr1[i]);
//	    }
	    if(n > m) {
	    	int j = 0;
	    	for (int i = 0 ; i < n ; i++) {
	    		if(j < m) {
	    		if(arr1[i] == arr2[j]) {
	    			System.out.println(arr1[i]);
	    			//i++;
	    			j++;
	    		}else if(arr1[i] < arr2[j]) {
	    			i++;
	    		}else {
	    			j++;
	    		}
	    	}
	    	}
	    }else {
	    	int j = 0;
	    	for (int i = 0 ; i < m ; i++) {
	    		if(j < n) {
	    		if(arr1[j] == arr2[i]) {
	    			System.out.println(arr2[i]);
	    			//i++;
	    			j++;
	    		}else if(arr2[i] < arr1[j]) {
	    			i++;
	    		}else {
	    			j++;
	    		}
	    	}
	    	}
    	} 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr1[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr1[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int arr2[] = new int[m];
		for(int i = 0 ; i < m ; i++) {
			arr2[i] = sc.nextInt();
		}
        intersection(arr1, arr2);
	}

}
