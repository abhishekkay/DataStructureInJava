import java.util.Scanner;
import java.util.Stack;
public class StockSpan {
	public static int[] stockSpan(int[] price) {
		Stack<Integer> st = new Stack<Integer>();
		int n = price.length;
		int S[] = new int[n];
		st.push(0);
		S[0] = 1;
		for(int i = 1 ; i < n ; i++) {
			while(!st.isEmpty() && price[st.peek()] <= price[i]) {
				st.pop();  
			}
			  if(st.isEmpty()) {
			    	S[i] = (i+1);
			    }else {
			    	S[i] = (i - st.peek());
			    }
			    st.push(i);
		}
       return S;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		//System.out.println(arr.length);
        int b[] = stockSpan(arr);
       // System.out.println(b.length);
        for(int i = 0 ; i < n ; i++) {
        	System.out.print(b[i]+" ");
        }
	}

}
