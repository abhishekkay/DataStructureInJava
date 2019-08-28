package Recursion2;

public class PrintSubsets {
    public static void printSubsets(int input[]) {
    	int output[] = new int[0];
    	printSubsets(input, 0 , output);
    }
    public static void printSubsets(int input[] , int startIndex , int[] output) {
    	if(startIndex == input.length) {
    		for(int i = 0 ; i < output.length ; i++) {
    			System.out.print(output[i]+" ");
    		}
    		System.out.println();
    		return;
    	}
    	int newoutput[] = new int[output.length+1];
    	int i = 0 ; 
    	for(i = 0; i < output.length ; i++) {
    		newoutput[i] = output[i];
    	}
    	newoutput[i] = input[startIndex];
    	printSubsets(input, startIndex+1, output);
    	printSubsets(input, startIndex+1, newoutput);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int input[] = {1,2,3};
        printSubsets(input);
	}

}
