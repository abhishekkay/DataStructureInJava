package Patt;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int orginal = n;
		int cnt = 0 , result =  0 , rem = 0;
		while(orginal != 0) {
			orginal /= 10;
			cnt++;
		}
		//System.out.println(cnt);
		int i = 1 , pow = 1;
       orginal = n;
       while(orginal != 0) {
    	   rem = orginal % 10;
    	   pow = 1;
    	  // System.out.println(rem+"=>"+"remainder");
    	   pow = (int)(Math.pow(rem, cnt)); 
    	   result+=pow;
    	   orginal /= 10;
       }
       if(result == n) {
    	   System.out.println("true");
       }
       else {
    	   System.out.println("false");
       }
	}

}
