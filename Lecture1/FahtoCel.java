import java.util.Scanner;
public class FahtoCel {
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
      int f = sc.nextInt();
      int cel = (int)((5.0/9)*(f-32));
      System.out.println(cel);
	}

}
