import java.util.Scanner;

public class Main {
	 public static int minNum(int A, int K, int P) {
	     if(A > K){
	        return -1;
	    }
	    if(A == K){
	        return -1;
	    }
	     int suman = A+P;
	     int sumkum = K;
	     int count = 1;
	    // System.out.println(suman+" "+sumkum);
	    while(suman >= sumkum ){
	        suman= suman + A;
	        sumkum = sumkum + K;
	       // System.out.println(suman+" "+sumkum);
	        //break;
	        count++;
	    }
	     return count;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int k = sc.nextInt();
       int p = sc.nextInt();
       System.out.println(minNum(n, k, p));
	}

}
