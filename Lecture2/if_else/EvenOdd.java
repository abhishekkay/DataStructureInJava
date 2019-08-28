package if_else;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n%2 == 0) {
        	System.out.println("Even");
        	//return;
        }else {
        	System.out.println("Odd");
        }
	}

}
