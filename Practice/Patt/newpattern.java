package Patt;

import java.util.Scanner;

public class newpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = n;
		int flag = n;
		while(i >= 1) {
			int j = 1;
			while(j <= i) {
				if(i == flag) {
					System.out.print("1");
				}else {
					System.out.print("0");
				}
				j++;
			}
			if(i == flag && flag > 0) {
				flag  = flag - 2;
			}
			System.out.println();
			i--;
		}
		

	}

}
