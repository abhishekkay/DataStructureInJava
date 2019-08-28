import java.util.Scanner;

public class NumberstartPattern {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 1 ; j <= (2*i-1);j++) {
				if(j%2 == 0) {
					System.out.print("*");
				}else {
					System.out.print(i);
				}				
			}
			System.out.println();
		}
		for(int i = n ; i >= 1 ; i--) {
			for(int j = 1 ; j <= (2*i-1);j++) {
				if(j%2 == 0) {
					System.out.print("*");
				}else {
					System.out.print(i);
				}			
			}
			System.out.println();
		}
	}

}
