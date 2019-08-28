package while_loop;

import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		// Write your code here
        Scanner scan = new Scanner(System.in);
		  int n = scan.nextInt();
		  int[]num=new int [n];
		  int count = 0 , temp=0;
		  for (int i=0;i<n;i++)
		  {
		   num [i] = scan.nextInt();  
		     }
		 for(int i = 0 ; i<n-1;i++)
		 {
		     if(count==0)
		     {
		  if(num[i]<num[i+1])
		  {
		// System.out.println(count+"3"+num[i]);
		   count++;
		  }
		     }
		  else if(count==1)
		  {
		    if(num[i]>num[i+1])
		  {
		 // System.out.println(count+"2");
		   count++;
		  }
		  }
		 else if(count>1)
		  {
			//System.out.println(count+"1");
		      break;
		  }
		 }
		 if(count==0||count==1)
		 {
		  System.out.println("true");
		 }
		 else
		 {
		  System.out.println("false");
		 }

	}

}
