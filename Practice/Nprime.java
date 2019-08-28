import java.util.Scanner;

public class Nprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int c = 0;
		for(int i = 2 ; i <= n ; i++) {
			for(c = 2 ; c < i ; c++) {
				if(i%c == 0) {
					break;
				}
			}
			if(c == i) {
				System.out.println(c);
			}
		}
	}

}
