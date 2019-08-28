package Recursion2;

import java.util.Scanner;

public class Subsequences {
    public static String[] findSubsequences(String str) {
    	  if(str.length() == 0) {
    		  String ans[] = {""};
    		  return ans;
    	  }
    	  String smallAns[] = findSubsequences(str.substring(1));
    	  String ans[] = new String[2 * smallAns.length];
    	  //int k = 0;
    	  for(int i = 0 ; i < smallAns.length ; i++) {
    		  ans[i] = smallAns[i];
    		 // ans[k++] = smallAns[i];
    	  }
    	  for(int i = 0 ; i < smallAns.length ; i++) {
    		  ans[i + (smallAns.length)]  = str.charAt(0) + smallAns[i];
    		  //ans[k] = = str.charAt(0) + smallAns[i];
    		  //k++;
    	  }
    	  return ans;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String  s = sc.nextLine();
	    String ans[] = findSubsequences(s);
	    for(int i = 0 ; i < ans.length ; i++) {
	    	System.out.print(ans[i]+" ");
	    }
	}

}
