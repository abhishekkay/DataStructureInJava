package Scope;

import java.util.Scanner;

public class Scope1 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  int n = sc.nextInt();
		  int c = sc.nextInt();
		  long sum = 0;
		  long mul = 1;
		  if(c == 1) {
			  for(int i = 1 ; i <= n ; i++) {
				  sum += i;
			  }
			  System.out.println(sum);
		 }else if(c == 2) {
			 for(int i = 1 ; i <= n ; i++) {
				 mul *= i;
			 }
			 System.out.println(mul);
		 }
		 else {
			 System.out.println(-1);
		 }
	}

}
