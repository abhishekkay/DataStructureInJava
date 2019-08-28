package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		//System.out.println(list1.size());
        list1.add(15);
        list1.add(25);
        list1.add(20);
        list1.add(2, 50);
        for(int i : list1) {
        	//i = 10;
        	System.out.print(i+" ");
        }
	}

}
