package Pattern1;

import java.util.Scanner;

public class Pattern_Three {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int i = 1;
		int val = 1;
		char a;
		while(i <= n) {
			int j = 1;
			val = 65;
			while(j <= n) {
				a = (char) (val);
				System.out.print(a);
				val++;
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
