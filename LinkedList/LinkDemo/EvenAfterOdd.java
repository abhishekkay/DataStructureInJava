package LinkDemo;

import java.util.Scanner;


public class EvenAfterOdd {
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
	 public static LinkedListNode<Integer> sortEvenOdd(LinkedListNode<Integer> head) {
		int flagEven = 0 , flagOdd = 0;
        LinkedListNode<Integer> oddH = null , oddT = null , evenH = null , evenT = null , temp = head;
        while(temp != null) {
        	if(temp.data%2 != 0) {
        		if(oddH == null) {
        			oddH = temp;
        			oddT = temp;
        		}else {
        			oddT.next = temp;
        			oddT = temp;
        		}
        		flagOdd++;
        	}else {
        		if(evenH == null) {
        			evenH = temp;
        			evenT = temp;
        		}else {
        			evenT.next = temp;
        			evenT = temp;
        		}
        		flagEven++;
        	}
        	temp = temp.next;
        }
        if(flagEven != 0 && flagOdd != 0) {
        	oddT.next = evenH;
        	evenT.next = null;
        	head = oddH;
        }else {
        	return head;
        }
         return head;
		}
	 public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
		   LinkedListNode<Integer> current = head;
		   LinkedListNode<Integer> next = null;
		   LinkedListNode<Integer> prev = null;
		   int count = 0;
		   while(count < k && current != null) {
			   next = current;
			   current.next = prev; 
	           prev = current; 
	           current = next; 
	           count++;
		   }
		   if (next != null)  
		          head.next = kReverse(next, k);
		   return prev;
	    }
	 public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
         if(M == 0) {
        	 return null;
         }
		 LinkedListNode<Integer> t1 = head , t2;
		 int count = 0;
		 while(t1 != null) {
			 for(count = 1 ; count < M && t1 != null ; count++)
				 t1 = t1.next;
			 if(t1 == null)
				 return head;
			 t2 = t1.next;
			 for(count = 1 ; count <= N && t2 != null ; count++ ) {
				 t2 = t2.next;
			 }
			 t1.next = t2;
			 t1 = t2;
		 }
		 return head;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode<Integer> head = takeInput();
		head = skipMdeleteN(head, 2, 3);
		print(head);

	}

}
