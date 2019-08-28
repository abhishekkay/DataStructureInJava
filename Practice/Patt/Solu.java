package Patt;

import java.util.Scanner;

public class Solu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i , j;
		for( i = 1 ; i <= n ; i++) {
			for( j = 1 ; j <= n ; j++) {
				if(i == j) {
					System.out.print("*");
				}else {
					System.out.print("0");
				}
			}
			//System.out.println(j);
				j--;
				System.out.print("*");
				while(j>=1) {
					if(i == j) {
						System.out.print("*");
					}else {
						System.out.print("0");
					}
					j--;
				}
				System.out.println();
		}

	}

}
