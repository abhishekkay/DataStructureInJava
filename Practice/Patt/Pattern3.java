package Patt;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int n1 = (n+1)/2;
		int i = 1;
		int n2 = n1 - 1;
		while(i <= n1) {
			int j = 1;
			while(j <= n1 - i) {
				System.out.print(" ");
				j++;
			}
			j = 1;
			while(j <= 2 * i - 1) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		

	}

}
