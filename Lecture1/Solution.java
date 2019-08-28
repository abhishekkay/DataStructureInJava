import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
	String str = scan.nextLine();
    char a = str.charAt(0);
    int i1 , i2 , i3 , avg;
    i1 = scan.nextInt();
    i2 = scan.nextInt();
    i3 = scan.nextInt();
    avg = (i1 + i2 + i3)/3;
    System.out.println(a);
    System.out.println(avg);
		
		
	}

}
