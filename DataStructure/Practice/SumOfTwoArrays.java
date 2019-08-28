package Practice;

import java.util.Scanner;

public class SumOfTwoArrays {
    public static int[] sumotwoarrays(int arr1[] , int arr2[]) {
    	int n = arr1.length;
    	int m = arr2.length;
    	int carry = 0;
    	int size = Math.max(n, m);  	
        int sum[] = new int[size+1];
        int l1 = n - 1 , l2 = m - 1 , l3 = sum.length - 1;
        while(l3>=0) {
        	if(l1>=0 && l2>=0) {
        		sum[l3] = carry + arr1[l1]+arr2[l2];
        		if(sum[l3]>9) {
        			carry = 1;
        			sum[l3]%=10;
        		}else {
        			carry = 0;
        		}
        		l1--;
        		l2--;
        		l3--;
        	}else if(l1 < 0 && l2 >= 0) {
        		sum[l3] = carry + arr2[l2];
        		if(sum[l3]>9) {
        			carry = 1;
        			sum[l3]%=10;
        		}else {
        			carry = 0;
        		}
        		//l1--;
        		l2--;
        		l3--;
        	}else if(l1 >= 0 && l2 < 0) {
        		sum[l3] = carry + arr1[l1];
        		if(sum[l3]>9) {
        			carry = 1;
        			sum[l3]%=10;
        		}else {
        			carry = 0;
        		}
        		l1--;
        		//l2--;
        		l3--;
        	}else {
        		sum[l3] = carry;
        		l3--;
        	}
        }
    	return sum;
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
        int arr3[] =  sumotwoarrays(arr1, arr2);
        for(int i = 0 ; i < arr3.length ; i++) {
        	System.out.print(arr3[i]+" ");
        }
       
	}

}
