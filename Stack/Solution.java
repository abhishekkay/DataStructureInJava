import java.util.Scanner;

public class Solution {
   public static boolean checkBalanced(String exp) throws StackEmptyException {
	   boolean isTrue = true;
	   StackUsingLL<Character> stack = new StackUsingLL<>();
	   for(int i = 0 ; i < exp.length() ; i++) {
		   char a = exp.charAt(i);
		   if(a == '{' || a == '[' || a == '(') {
			   stack.push(a);
		   }else if(!stack.isEmpty()) {
			   char b = stack.top();
			   if(a == '}' && b == '{') {
			      stack.pop();
			   }else if(a == ']' && b == '[') {
				      stack.pop();
			   }else if(a == ')' && b == '(') {
				      stack.pop();
			   }
		   }
	   }
	   if(stack.size() > 0) {
		   return false;
	   }
	   return isTrue;
   }
   public static void main(String[] args) throws StackEmptyException {
	Scanner sc = new Scanner(System.in);
	String exp = sc.nextLine();
	System.out.println(checkBalanced(exp));
   }
}
