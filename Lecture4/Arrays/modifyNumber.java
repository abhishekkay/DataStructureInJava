package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class modifyNumber {
	 static HashMap <Integer, Integer> hm = new HashMap<Integer, Integer>(); 
	  
	   static void countFreq(int a[], int n) 
	   {  
	        for (int i=0; i<n; i++) 
	            if (hm.containsKey(a[i]) ) 
	                hm.put(a[i], hm.get(a[i]) + 1); 
	            else hm.put(a[i] , 1); 
	    } 
	    
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
        countFreq(arr, n);
        int flag = 0;
        for(int i = 0 ; i < n; i++) {
        	if(hm.containsKey(arr[i])) {
        		int num = hm.get(arr[i]);
        		if(num > n/2) {
        			System.out.println(arr[i]);
        			flag = 0;
        			return;
        		}else {
        			flag = 1;
        		}
        	}
        }
        if(flag == 1) {
        	System.out.println(-1);
        }
        
	}

}
