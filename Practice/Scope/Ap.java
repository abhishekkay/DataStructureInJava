package Scope;

import java.util.Scanner;

public class Ap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1 , i = 1;
		int ap = 1;	
		while(count <= n) {
			ap = 3*i+2;
		  	if(ap % 4 != 0) {  		
		  		System.out.print(ap+" ");
		  		count++;
		  	}  
		  	i++;
		}

	}

}
