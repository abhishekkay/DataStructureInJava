package LinkDemo;

import java.util.Scanner;

public class LinkedListUse {
	public static Node<Integer> takeInput(){
		Node<Integer> head = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		
		while(data != -1) {
			 Node<Integer> newNode = new Node<Integer>(data);
			 if(head == null) {
				 head = newNode;
			 }else {
				 Node<Integer> temp = head;
				 while(temp.next != null) {
					 temp = temp.next;
				 }
				 temp.next = newNode;
			 } 
			 data = s.nextInt();
		}
		return head;
	}
    public static void print(Node<Integer> head ) {
    	Node<Integer> temp = head;
    	while(head != null) {
    		System.out.print(head.data+" ");
    		head = head.next;
    	}
    	System.out.println();
//    	head = temp;
//    	while(head != null) {
//    		System.out.print(head.data+" ");
//    		head = head.next;
//    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Node<Integer> node1 = new Node<Integer>(10);
		Node<Integer> node2 = new Node<Integer>(20);
		Node<Integer> node3 = new Node<Integer>(30);
		node1.next = node2;
		node2.next = node3;
		Node<Integer> head = node1;
		print(head);
		print(head);
		*/
		Node<Integer> head = takeInput();
		print(head);
		 
	}

}
