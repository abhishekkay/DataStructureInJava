package LinkDemo;

import java.util.Scanner;

public class LinkedLisUse2 {
	public static Node<Integer> takeInput(){

		Node<Integer> head = null , tail = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		
		while(data != -1) {
			 Node<Integer> newNode = new Node<Integer>(data);
			 if(head == null) {
				 head = newNode;
				 tail = newNode;
			 }else {
				 tail.next = newNode;
			 } 
			 data = s.nextInt();
			 tail = newNode; // tail = tail.next
		}
		return head;
	}

	 public static void print(Node<Integer> head){
		    Node<Integer> temp = head;

		    while(temp != null){
		        System.out.print(temp.data +" ");
		        temp = temp.next;
		    }
		    System.out.println();
		}
	 public static DoubleNode reverseR(Node<Integer> head) {
		if(head == null || head.next == null) {
			DoubleNode ans = new DoubleNode();
			ans.head = head;
			ans.tail = head;
			return ans;
		}
		DoubleNode smallAns = reverseR(head.next);
		smallAns.tail.next = head;
		head.next = null;
		DoubleNode ans = new DoubleNode();
		ans.head = smallAns.head;
		ans.tail = head;
		return ans;
	 }
	 public static int indexOfNRec(Node<Integer> head, int n) {
		if(head == null) {
			return -1;
		}
		if(head.data.equals(n)) {
			return 0;
		}
		int i =  indexOfNRec(head.next, n);
		if(i != -1) {
			return i+1;
		}else {
			return -1;
		}
	 }
	
        public static Node<Integer> insert(Node<Integer> head , int data , int pos) {
        	Node<Integer> newNode = new Node<Integer>(data);
        	if(pos == 0) {
        		newNode.next = head;
        		return newNode;
        	}
        	int i = 0;
        	Node<Integer> temp = head;
        	while(i < pos-1) {
        		temp = temp.next;
        		i++;      		
        	}
           newNode.next = temp.next;
           temp.next = newNode;
           return head;
        }
		public static void main(String args[]){
//		    Node<Integer> node1 = new Node<Integer>(10);
//		    Node<Integer> node2 = new Node<Integer>(20);
//		    node2.next = node1;
//		    print(node2);
			Node<Integer> head = takeInput();
			System.out.println(indexOfNRec(head, 1));
			

		}
}
