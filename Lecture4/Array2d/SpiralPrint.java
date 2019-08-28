package Array2d;

import java.util.Scanner;

public class SpiralPrint {
	public static void spiralPrint(int matrix[][]){
		// Write your code here
		int n = matrix.length;
		int m = matrix[0].length;
		int i, k = 0, l = 0; 
		int numElements = n * m , count = 0;
		while(count < numElements)
		{
			for(i = k ; count < numElements && i < m ; ++i) {
				System.out.print(matrix[l][i]+" ");
				count++;
			}
			l++;
			for(i = l ; count < numElements && i < n ; ++i) {
				System.out.print(matrix[i][m-1]+" ");
				count++;
			}
			m--;
			for(i = m - 1 ; count < numElements && i >= k ; --i) {
				System.out.print(matrix[n-1][i]+" ");
				count++;
			}
			n--;
			for(i = n - 1 ; count < numElements && i >=l ; --i) {
				System.out.print(matrix[i][k]+" ");
				count++;
			}
			k++;
			
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
		
		spiralPrint(arr);

	}

}
