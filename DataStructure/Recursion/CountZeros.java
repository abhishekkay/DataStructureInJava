package Recursion;

import java.util.Scanner;

public class CountZeros {
    public static int countZerosRec(int input) {
    	if(input == 0) {
    		return 1;
    	}
    	else {
    		return findZeros(input);
    	}
    }
    public static int findZeros(int input) {
    	if(input == 0) {
    		return 0;
    	}
    	int smallAns;
    	smallAns = findZeros(input/10);
        if(input % 10 == 0) {
        	return smallAns+1;
        }else {
        	return smallAns;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(countZerosRec(input));

	}

}
