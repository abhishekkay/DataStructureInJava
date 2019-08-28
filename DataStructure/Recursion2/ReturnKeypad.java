package Recursion2;

import java.util.Scanner;

public class ReturnKeypad {
    public static String[] keypad(int n) {
    	if(n <= 1) {
    		String ans[] = {""};
    		return ans;
    	}
       String prev[] = keypad(n/10);
       char[] helper = keypadhelper(n%10);
       String actual[] = new String[(int)Math.pow(4.00,count(n))];
       String s = new String(helper);
       int k = 0;
//       for(int i = 0 ; i < prev.length ; i++) {
//    	   System.out.println(prev[i]+" "+n);
//       }
       for(int j=0;j<s.length();j++){
           for(int i=0;i<prev.length;i++){
               actual[k]=prev[i]+s.charAt(j);
              // System.out.println(actual[k]);
               k++;
             }
          // System.out.println(prev[i]);
            // System.out.println(s.charAt(j));
       }
       int count=0;
       for(int i=0;i<actual.length;i++){
         if(actual[i]==null){
           count++;
         }
       }
       String newString[]=new String[actual.length-count];
       for(int i=0;i<actual.length;i++){
         if(actual[i]!=null){
 	        newString[i]=actual[i];
       	}
       }
       return newString;  
    }
	public static double count(int n){
	      double count=0;
		   while(n>0){
		       count++;
		       n=n/10;
		   }
	      return count;
	    }
    
    public static char[] keypadhelper(int n) {

    	if(n == 2) {
    		char ans[] = {'a','b','c'};
    		return ans;
    	}
    	if(n == 3) {
    		char ans[] = {'d','e','f'};
    		return ans;
    	}
    	if(n == 4) {
    		char ans[] = {'g', 'h', 'i'};
    		return ans; 		
    	}
    	if(n == 5) {
    		char ans[] = {'j', 'k', 'l'};
    		return ans; 		
    	}
    	if(n == 6) {
    		char ans[] = {'m', 'n', 'o'};
    		return ans; 		
    	}
    	if(n == 7) {
    		char ans[] = {'p', 'q', 'r','s'};
    		return ans; 		
    	}
    	if(n == 8) {
    		char ans[] = {'t', 'u', 'v'};
    		return ans; 		
    	}
    	else {
    		char ans[] = {'w','x','y','z'};
    		return ans;
    	}
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        String smallAns[] = keypad(n);
//        for(int i = 0 ; i < smallAns.length ; i++) {
//        	System.out.print(smallAns[i]+" ");
//        }
	}

}
