package Strings;

import java.util.Scanner;

public class ReverseStringWordWise {
    public static void reverseword(String str) {
       String s[] = str.split(" ");
       str="";
       for(int i = s.length - 1 ; i >=0 ; i--){
    	   str+=s[i]+" ";
       }
       System.out.println(str);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		reverseword(str);
	}

}
