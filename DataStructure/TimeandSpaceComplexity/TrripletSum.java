package TimeandSpaceComplexity;
import java.util.Scanner;
public class TrripletSum {
	public static void FindTriplet(int[] arr, int x){
		int n = arr.length;
		for(int i = 0 ; i < n ; i++) {
			for(int j = i +1 ;  j < n ; j++) {
				for(int k = j + 1 ; k < n ; k++) {
					if(arr[i]+arr[j]+arr[k] == x) {
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		FindTriplet(arr, x);

	}

}
