package LinkDemo;

import java.util.Scanner;

public class SwapTwoNode {
	public static int length(LinkedListNode<Integer> head){
	      LinkedListNode<Integer> temp = head;
	      int count = 0;
	      while(temp != null){
	           count++;
	          temp = temp.next;
	      }
		  return count;	
		}
	 public static LinkedListNode<Integer> takeInput(){
	    	LinkedListNode<Integer> head = null , tail = null;
	    	Scanner sc = new Scanner(System.in);
	    	int data = sc.nextInt();
	    	while(data != -1) {
	    	LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
	    	if(head == null) {
	    		head = newNode;
	    		tail = newNode;
	    	}else {
	    		tail.next = newNode;
	    	}
	    		data = sc.nextInt();
	    		tail = newNode;  // tail = tail.next
	    	}
	    	return head;
	    }
	 public static void print(LinkedListNode<Integer> head) {
	    	LinkedListNode<Integer> temp = head;
	    	while(temp != null) {
	    		System.out.print(temp.data+" ");
	    		temp = temp.next;
	    	}
	    	System.out.println();
	    }
	 public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
		LinkedListNode<Integer> current = head , prev = null , next = null;
		int count = 0;
		while(count < k && current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next ;
			count++;
		}
		if(next != null) {
			head.next = kReverse(next, k);
		}
		System.out.println(prev.data);
		return prev;		
	 }
	 public static  LinkedListNode<Integer> swap_nodes(LinkedListNode<Integer> head,int i,int j){
			if(i == j) {
				return null;
			}
			LinkedListNode<Integer> prev1 = null , curr1 = head , prev2 = null , curr2 = head;
			int x = 0 , y = 0;
			while(curr1 != null && x < i) {
				prev1 = curr1;
				curr1 = curr1.next;
				x++;
			}
			//System.out.println(prev1.data+" "+curr1.data);
			while(curr2 != null && y < j) {
				prev2 = curr2;
				curr2 = curr2.next;
				y++;
			}
		//	System.out.println(prev2.data+" "+curr2.data);
			if(curr1 == null || curr2 == null) {
				return null;
			}
			if(prev1 != null) {
				prev1.next = curr2;
			}else {
				head = curr2;
			}
			if(prev2 != null) {
				prev2.next = curr1;
			}else {
				head = curr1;
			}
//			prev1.next = curr2;
//			prev2.next = curr1;
//			curr1.next = curr2.next;
//			curr2.next = prev2;
			LinkedListNode<Integer> temp = curr1.next;
            curr1.next = curr2.next;
            curr2.next = temp;
			return head;
		}
    public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head )
		{
		int size = length(head);
		if(size >1) {
			for(int i = 0 ; i < size ; i++) {
				LinkedListNode<Integer> current = head;
				LinkedListNode<Integer> next = head.next;
				for(int j = 0 ; j < size - 1 ; j++) {
					if(current.data > next.data) {
						int temp = current.data;
						current.data = next.data;
						next.data = temp;
					}
					current = next ;
					next = next.next;
				}
			}
		}
		return head;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode<Integer> head = takeInput();
		head = bubbleSort(head);
		print(head);

	}

}
