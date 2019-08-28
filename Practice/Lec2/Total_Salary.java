package Lec2;

import java.util.Scanner;

public class Total_Salary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int basic = sc.nextInt(); 
        char grade = sc.next().charAt(0);
        int  g = grade;
        float totalSalary = 0 ;
        int allow;
        float  hra , da , pf;
        hra =  ((0.20f)*basic);
        da =  ((0.50f)*basic);
        pf = ((0.11f)*basic);
        if(g == 65) {
        	allow = 1700;	
        }else if(g == 66) {
        	allow = 1500;
        }else {
        	allow = 1300;
        }
        totalSalary = (basic + hra + da + allow - pf);
        System.out.println(Math.round(totalSalary));
	}

}
