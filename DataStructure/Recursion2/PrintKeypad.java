package Recursion2;

public class PrintKeypad {
    public static void printKeypad(int input) {
    	printKeypad(input, "");
    }
    public static void printKeypad(int input , String output) {
    	if(input == 0) {
    		System.out.println(output);
    		return;
    	}
    	  int lastDigit = input % 10;
   	      int smallerNumber = input / 10;
   	      char options[] = keypadhelper(lastDigit);
   	      for(int i = 0 ; i < options.length ; i++) {
   	    	  printKeypad(smallerNumber, options[i]+output);
   	      }
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
       printKeypad(23);
	}

}
