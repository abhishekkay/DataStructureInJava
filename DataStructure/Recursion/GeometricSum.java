package Recursion;

import java.util.Scanner;

public class GeometricSum {
	static double sum = 1;
    public static double findGeometricSum(int k) {
    	if(k == 0) {
    		return 0;
    	}else {
    	return findGeometric(k+1);
    	}
    }
    public static double findGeometric(int k) {
    	if(k == 0) {
    		return 0;
    	}
    	double smallAns = findGeometric(k-1)+sum;
    	sum *= (0.50);
    	//System.out.println(sum+" "+smallAns+" "+k);
    	return smallAns;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(findGeometricSum(n));
	}

}
