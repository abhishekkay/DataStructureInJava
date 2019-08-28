import java.util.Scanner;

public class Print2D {

	public static void print2DArray(int input[][]) {
		// Write your code here
		int n = input.length;
		int m = input[0].length;
		int val = n -1;
		for(int i = 0 ; i < input.length ; i++) {
			for(int l = n - 1 ; l >= 0 ; l--) {
			     for(int j = 0 ; j < m ; j++) {
			    	 System.out.print(input[i][j]+" ");
			     }
			     System.out.println();
			}
			n--;
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
		print2DArray(arr);

	}

}
