import java.util.Scanner;

public class Leaderinarray {
	public static void leaders(int[] inputArray) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */
		for (int i = 0; i < inputArray.length; i++)
        {
            boolean flag = true;
 
            for (int j = i+1; j < inputArray.length; j++)
            {
                if (inputArray[j] > inputArray[i])
                {
                    flag = false;
 
                    break;
                }
            }
 
            if (flag)
            {
                System.out.print(inputArray[i]+" ");
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
		leaders(arr);

	}

}
