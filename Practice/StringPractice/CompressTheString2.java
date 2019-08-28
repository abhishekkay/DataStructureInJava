package StringPractice;

import java.util.Scanner;

public class CompressTheString2 {
    public static String Compress(String inputString) {
    	String s1 = inputString.charAt(0)+"";
        if(inputString.length() == 0) {
        	return "";
        }
        int count = 1;
        for(int i = 1 ; i < inputString.length() ; i++) {
        	if(inputString.charAt(i) == inputString.charAt(i-1)) {
        		count++;
        		if(i == inputString.length() - 1) {
        			s1 += count;
        		}
        	}else {
        		if(count > 1) {
        			s1 += count + "" +inputString.charAt(i);
        		}else {
        			s1 += inputString.charAt(i);
        		}
        		count = 1;
        	}
        	
        }
    	return s1;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		System.out.println(Compress(inputString));

	}

}
