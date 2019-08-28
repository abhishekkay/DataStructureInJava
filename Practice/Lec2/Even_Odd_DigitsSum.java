package Lec2;

import java.util.Scanner;

public class Even_Odd_DigitsSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); 
		int rem , odd_sum = 0 , even_sum = 0 , digit;
		while(num > 0) {
			digit = num % 10;
			if(digit % 2 == 0) {			
				even_sum = even_sum + digit;
			}else {
				odd_sum = odd_sum + digit;
			}	
			num = num / 10;
		}
		System.out.println(even_sum +" "+odd_sum);
	}

}
