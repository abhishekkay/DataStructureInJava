package SearchingandSort;
import java.util.Scanner;

public class PushZerosToEnd {
    public static void pushZeroAtEnd(int arr[]) {
    	int n = arr.length;
    	int count = 0;
    	for(int i = 0 ; i < n ; i++) {
    		if(arr[i] != 0) {
    			arr[count++] = arr[i];
    		}
    		
    	}
    	while(count < n) {
			arr[count++] = 0;
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
        pushZeroAtEnd(arr);
        for(int i = 0 ; i < n; i++) {
        	System.out.print(arr[i]+" ");
        }
	}

}
