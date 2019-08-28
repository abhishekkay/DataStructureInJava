package Patt;
import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int i = n;
		char a;
		int j;
		//int val = 1;
		while(i >= 1) {
			j = i;
			while(j <= n) {
				a = (char) (64+j);
				System.out.print(a);
				j++;
			}
			System.out.println();
			i--;
		}

	}

}
