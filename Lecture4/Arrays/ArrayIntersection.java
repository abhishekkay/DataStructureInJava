package Arrays;

import java.util.Scanner;

public class ArrayIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int a[] = new int[n];
       for(int i = 0 ; i < n ; i++) {
    	   a[i] = sc.nextInt();
       }
       int m = sc.nextInt();
       int b[] = new int[m];
       for(int i = 0 ; i < m; i++) {
    	   b[i] = sc.nextInt();
       }
       for(int i = 0 ; i < n ; i++) {
    	   for(int j = 0 ; j < m ; j++) {
    		   if(b[j] == a[i]) {
    			  System.out.println(a[i]);
    			  b[j] = Integer.MIN_VALUE;
    			  a[i] = -1000;			  
    		   }
    	   }
       }
	}

}
