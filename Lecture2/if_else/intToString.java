package if_else;

import java.util.Scanner;

public class intToString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        char s = sc.next().charAt(0);
        int a = s;
        if(a >= 97 && a <= 122) {
        	System.out.println("0");
        }else if(a >= 65 && a <= 90) {
        	System.out.println("1");
        }else {
        	System.out.println("-1");
        }
	}

}	
