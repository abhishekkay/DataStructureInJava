package Strings;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length()-1;
        boolean istrue = false;
        for(int i = 0 ; i < str.length() ; i++) {
        	if(str.charAt(i) == str.charAt(len)) {
        		istrue = true;
        		len--;
        	}else {
        		istrue = false;
        		break;
        	}
        }
        System.out.println(istrue);
	}

}
