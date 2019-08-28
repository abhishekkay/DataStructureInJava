import java.util.Stack;
public class StackCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		int arr[] = {5,8,2,1};
		for(int i = 0 ; i < arr.length ; i++) {
			stack.push(arr[i]);
		}
		System.out.println(stack.size());
        while(!stack.isEmpty()) {
        	System.out.println(stack.pop());
        }
	}

}
