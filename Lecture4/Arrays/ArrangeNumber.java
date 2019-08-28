package Arrays;
import java.util.Scanner;
public class ArrangeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int val = n - 1;
		int temp = 1;
		for(int i = 1 ; i <= n ; i++ ) {
			if(i % 2 == 0) {
				arr[val] = i;
				val--;
			}
			else {
				arr[temp-1] = i;
				temp++;
			}
		}
       for(int i = 0 ; i < n ; i++) {
    	   System.out.print(arr[i]+" ");
       }
       System.out.println();
	}

}
