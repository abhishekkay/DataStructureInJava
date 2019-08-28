package Patt;

import java.util.Scanner;

public class Alphapattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		char a;
		while(i <= n) {
			int j = 1;
			while(j <= i) {
				a = (char) (64+i);
				System.out.print(a);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
