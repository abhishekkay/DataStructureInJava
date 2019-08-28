package Recursion;

import java.util.Scanner;

public class Sum {
    public static int sum(int input[]) {
    	if(input.length <= 0) {
    		return 0;
    	}
    	int temp[] = new int[input.length - 1];
    	for(int i = 1 ; i < input.length ; i++) {
    		temp[i-1] = input[i];
    	}
    	int smallAns = sum(temp);
    	//System.out.println(smallAns);
    	return smallAns + input[0];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int input[] = new int[n];
        for(int i = 0 ; i < n ; i++) {
        	input[i]=sc.nextInt();
        }
        System.out.println(sum(input));
	}

}
