package Scope;

import java.util.Scanner;

public class DecimaltoBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long rem = 0 , pvalue = 1;
		long bin_val = 0;
		while(n != 0) {
			rem = n % 2;
			bin_val = bin_val + rem * pvalue;
			n = n / 2;
			pvalue = pvalue * 10;		
		}
			System.out.println(bin_val);
	}

}
