import java.util.Stack;
import java.util.Scanner;
public class CheckBrackets {
	public static boolean checkRedundantBrackets(String input) {
		// Write your code here
		Stack<Character> st = new Stack<>();
		char[] str = input.toCharArray();
		for(char ch : str) {
			if(ch == ')') {
				char top = st.pop(); 
				boolean flag = true;
				while(top != '(') {
					if(top == '+' || top == '-' || top == '-' || top == '/') {
						flag = false;
					}
					top = st.pop();
				}
				if(flag == true) {
					return true;
				}
			}else {
				st.push(ch);
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(checkRedundantBrackets(s));

	}

}
