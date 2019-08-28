package Arrays;

import java.util.Scanner;

public class ArraySort0and1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];  
        for(int i = 0 ; i < n ; i++) {
        	arr[i] = sc.nextInt();
        }
       int i = 0 , j = n - 1;
       while(i < j ) {
    	   	while(arr[i] == 0 && i < j) {
    	   		i++;
    	   	}
    	   	while(arr[j] == 1 && i < j) {
    	   		j--;
    	   	}
    	   	if(i < j) {
    	   		arr[i] = 0;
    	   		arr[j] = 1;
    	   		i++;
    	   		j--;
    	   	}
       }
       for(i = 0 ; i < n ; i++) {
    	   System.out.print(arr[i]+" ");
       }
       /*
        int nextZero = 0;
        int i = 0;
        while(i < input.length){
        if(arr[i] == 0){
        int temp = arr[nextZero];
        arr[nextZero] = arr[i];
        arr[i] = temp;
        nextZero++;
        }
        i++;
        }
        */
	}

}
