package LinkDemo;
import java.util.LinkedList;
public class ColectionsLinkedList {

	public static void main(String[] args) {
	     LinkedList<Integer> list = new LinkedList<Integer>();
	     list.add(10);
	     list.add(30);
	     list.addFirst(40);
	     System.out.println(list.size());
	     for(int i = 0 ; i < list.size(); i++) {
	    	 System.out.print(list.get(i)+" ");
	     }
	     
	}

}
