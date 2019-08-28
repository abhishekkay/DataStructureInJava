package Lec2;

import java.util.Scanner;

public class Find_Powers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int i = 1 , mul = 1;
        while(i <= num2) {
        	mul = mul * num1;
        	i++;
        }
        System.out.println(mul);
	}

}
