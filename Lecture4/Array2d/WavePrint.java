package Array2d;

import java.util.Scanner;

public class WavePrint {
    public static void wavePrint(int input[][]) {
    	int rl = input.length;
       	int cl = input[0].length;
       	for(int j = 0 ; j < cl ; ++j) {
       		if(j%2 == 0) {
       		for(int i = 0 ; i < rl ; ++i) {
       			System.out.print(input[i][j]+" ");
       		}
       		}else {
       			for(int i = rl-1 ; i >=0 ; --i) {
       				System.out.print(input[i][j]+" ");
       			}
       		}
       	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[][] = new int[n][m];
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < m ; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		wavePrint(arr);
//		for(int j = 0 ; j < m ; j++) {
//			for(int i = 0 ; i < n ; i++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
	}

}
//4 4
//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
