package AssignmentRecursion1B;

import java.beans.DesignMode;
import java.util.Scanner;

public class TowerOfHanoi {
    public static void towerofHanoi(int disks , char source  , char auxiliary , char destination) {
    	if(disks == 0) {
    		//System.out.println(disks+" "+"1");
    		//System.out.println(source+" "+destination);
    		return;
    	}
    	//System.out.println(disks+" "+"2");
    	towerofHanoi(disks-1, source, destination, auxiliary);
    	//System.out.println(disks);
    	//System.out.println(source+" "+destination);
    	
    	towerofHanoi(disks-1, auxiliary, source, destination);
    	System.out.println(disks);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int disks = sc.nextInt();
		//sc.nextLine();
		char source = sc.next().charAt(0);
		char auxiliary = sc.next().charAt(0);
		char destination = sc.next().charAt(0);
		towerofHanoi(disks, source, auxiliary, destination);
		//System.out.println(source +" "+auxiliary);
        
	}

}
