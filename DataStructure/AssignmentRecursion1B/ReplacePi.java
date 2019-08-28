package AssignmentRecursion1B;

import java.util.Scanner;

public class ReplacePi {
    public static String replace(String input) {
    	 return replace(input, 0,"");
//        String str = input.replaceAll("pi","3.14");
//        return str;
    }
    public static String replace(String input , int startIndex , String output) {
//    	if(startIndex == input.length()) {
//    		return null;
//    	}
    	//System.out.println(startIndex);
    	if(startIndex+1 < input.length() && input.charAt(startIndex)=='p' && input.charAt(startIndex+1) == 'i') {
    		output +="3.14";
    		//System.out.println(startIndex);
    		startIndex++;
    		//return output;
    	}
    	else if(startIndex < input.length()){
    		output +=input.charAt(startIndex);
    		//System.out.println(input.charAt(startIndex)+" "+startIndex);
    		//return output;
    	}
    	//System.out.println(output);
    	if(startIndex < input.length()) { 
    	return  replace(input, startIndex+1, output);
    	}
    	else {
    		return output;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(replace(s));
		//System.out.println(s.length());

	}

}
