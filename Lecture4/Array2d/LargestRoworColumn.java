package Array2d;

import java.util.Scanner;

public class LargestRoworColumn {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int input[][] = new int[n][m];
		for(int i = 0 ; i<n ; i++) {
			for(int j = 0 ; j < m ; j++) {
				input[i][j] = sc.nextInt();
			}
		}
		int largest1 = Integer.MIN_VALUE;
		int largest2 = Integer.MIN_VALUE;
		int rowno = 0;
		int colno = 0;
//		int rows = input.length;
//		int cols = input[0].length;
		for(int i = 0; i < n; i++){
			int sum = 0;
			for(int j = 0; j < m; j++){
				sum = sum + input[i][j];
			}
			if(sum > largest1){
				largest1 = sum;
				rowno =  i;
			}
		}
		for(int j = 0; j < m; j++){
			int sum = 0;
			for(int i = 0; i < n; i++){
				sum = sum + input[i][j];
			}
			if(sum > largest2){
				largest2 = sum;
				colno = j;
			}
		}
		if(largest1>=largest2) {
			System.out.println("row"+" "+rowno+" "+largest1);
		}else {
			System.out.println("column"+" "+colno+" "+largest2);
		}
     
	}

}
