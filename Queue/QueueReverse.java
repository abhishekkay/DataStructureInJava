import java.util.*;

public class QueueReverse {
	
	public static void reverseQueue(Queue<Integer> q) {
		// Write your code here
		Stack<Integer> stack = new Stack<Integer>();
		while(!q.isEmpty()) {
			stack.add(q.peek());
			q.remove();
		}
		while(!stack.isEmpty()) {
			q.add(stack.peek());
			stack.pop();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<Integer>();
		
	}
	
}
