package Scope;

import java.util.Scanner;

public class BinarytoDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int  dec_val = 0 , base = 1 , rem;
		while(n != 0) {
			rem = n % 10;
			dec_val = dec_val + rem * base;
			n = n/10;
			base = base * 2;
		}
        System.out.println(dec_val);

	}

}
