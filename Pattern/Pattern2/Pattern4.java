package Pattern2;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int val = n;
		while(i <= n) {
			int j = 1;
			int spaces = 1;
			while(spaces <= i-1) {
				System.out.print(" ");
				spaces++;
			}
			while(j <= val) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
			val--;
		}

	}

}
