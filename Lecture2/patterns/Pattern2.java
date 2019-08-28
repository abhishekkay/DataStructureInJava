package patterns;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int i = 1 , val = 1;
		while(i <= n) {
			int j = 1;
			//val = 1;
			while(j <= i) {
				System.out.print(val);
				val++;
				j++;
			}
			
			System.out.println();
			//j = 1;
			i++;
		}
	}

}
