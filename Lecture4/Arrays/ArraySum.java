package Arrays;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        int input[] = new int[n];
        for(int i = 0 ; i < input.length ; i++) {
        	input[i] = sc.nextInt();
        	sum += input[i];
        }
        System.out.println(sum);
	}

}
