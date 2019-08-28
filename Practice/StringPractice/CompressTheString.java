package StringPractice;

import java.util.Scanner;

public class CompressTheString {
	public static String compress(String inputString) {
		// Write  your code here
        String s1 = "";
        int count;  
        char a = ' ';
        int n = inputString.length();
        for(int i = 0 ; i < n ; i++) {
        	count = 1;
        	while(i < n - 1 && inputString.charAt(i) == inputString.charAt(i+1)) {
        		count++;
        		i++;
        	}
        	if(count != 1) {
        		s1+=inputString.charAt(i);
        		s1 = s1+count;
        	}else {
        		s1+=inputString.charAt(i);
        	}
        }
        
        //System.out.println(s1);
       return s1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		System.out.println(compress(inputString));
		//compress(inputString);

	}

}
