package while_loop;

import java.util.Scanner;

public class Print1toN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int E = sc.nextInt();
		int W = sc.nextInt();
		int cel = 0;
		while(S <= E) {
			cel = (5 * (S - 32))/9;
			System.out.println(S+" "+cel);
			S = S + W;
		}
	}
}
