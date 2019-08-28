package Practice;

import java.util.Scanner;

public class Sort012 {
    public static void Sorting(int arr[]) {
    	int n = arr.length;
    	int nextZero = 0 , i = 0;
    	int nextTwo = n - 1;
        while(i <= nextTwo) {
        	if(arr[i] == 0) {
        		int temp = arr[nextZero];
        		arr[nextZero] = arr[i];
        		arr[i] = temp;
        		nextZero++;
        		i++;
        	}else if(arr[i] == 2){
        		int temp = arr[nextTwo];
        		arr[nextTwo] = arr[i];
        		arr[i] = temp;
        		nextTwo--;
        	}else {
        		i++;
        	}
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		Sorting(arr);
		for(int i = 0 ; i < n ; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
