package Recursion2;

public class PrintSubsequences {
	
    public static void printSubsequences(String input , String OutputSoFar) {
    	if(input.length() == 0) {
    		System.out.println(OutputSoFar);
    		return;
    	}
    	// w choose not to include the first character
    	printSubsequences(input.substring(1), OutputSoFar);
    	printSubsequences(input.substring(1), OutputSoFar+input.charAt(0));
    }
    public static void printSubsequences(String input) {
    	printSubsequences(input,"");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "xyz";
		printSubsequences(input);
		

	}

}
