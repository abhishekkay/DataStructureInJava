package Test;

import java.util.Scanner;
import java.util.Arrays;
public class MaximumProfit {
	public static int maximumProfit(int budget[]) {
		// Write your code here
		Arrays.sort(budget);
		int cost[] = new int[budget.length];
		for(int i = 0 ; i < budget.length ; i++) {
			cost[i] = budget[i] * (budget.length - i); 
		}
		int max = Integer.MIN_VALUE;
		for(int i : cost) {
			if (max < i) {
				max = i;
			}
		}
       return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(maximumProfit(arr));

	}

}
