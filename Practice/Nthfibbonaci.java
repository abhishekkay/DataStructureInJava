import java.util.Scanner;

public class Nthfibbonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int c = 0;
		while(a < n) {
			c = a + b;
			a = b;
			b = c;
		}
		if(a == n) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}

}
