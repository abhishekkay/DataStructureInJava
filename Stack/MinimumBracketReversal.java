import java.util.Scanner;
import java.util.Stack;
public class MinimumBracketReversal {
    
    public static int countBracketReversals(String input){
		int len = input.length();
		if(len%2 != 0) {
			return -1;
		}
		Stack<Character> st = new Stack<>();
		for(int i = 0 ; i < len ; i++)
		{
			char c = input.charAt(i);
			if(c == '}' && !st.isEmpty()) {
				if(st.peek() == '{') {
					st.pop();
				}else {
					st.push(c);
				}
			}else {
				st.push(c);
			}
		}
		int newLen = st.size();
		int n = 0;
		while(!st.isEmpty() && st.peek() == '{') {
			st.pop();
			n++;
		}
		return (newLen/2 + n % 2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(countBracketReversals(s));
		
	}	

}
