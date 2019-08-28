import java.util.Scanner;

public class MinimumLengthWord {
public static String minLengthWord(String input){
		String output = "";
		// Write your code here
		String s[] = input.split(" ");
		int arr[] = new int[s.length];
		for(int i = 0 ; i < s.length; i++) {
			arr[i] = s[i].length();			
		}
		int max = Integer.MAX_VALUE;
		int manIndex = 0;
		for(int i = 0 ; i < s.length ; i++ ) {
			if(max > arr[i]) {
				max = arr[i];
				manIndex = i;
			}
		}
		output = s[manIndex];
       return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(minLengthWord(input));

	}

}
