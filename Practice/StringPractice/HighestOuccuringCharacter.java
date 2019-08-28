package StringPractice;

import java.util.Scanner;

public class HighestOuccuringCharacter {
	public static char highestOccuringCharacter(String inputString) {
		// Write your code here
		int arr[] = new int[256];
		for(int i = 0 ; i < inputString.length() ; i++) {
			arr[inputString.charAt(i)]++;
		}
		int min = Integer.MIN_VALUE;
		int minindex = 0;
		for(int i = 0 ; i < inputString.length() ; i++) {
			if(min < arr[inputString.charAt(i)]) {
				min = arr[inputString.charAt(i)];
				minindex = inputString.charAt(i);
				//System.out.println(minindex+" "+min);
			}
		}
		char s = (char)(minindex);
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		//System.out.println((int)'a');
		System.out.println(highestOccuringCharacter(inputString));
		//highestOccuringCharacter(inputString);
	}

}
