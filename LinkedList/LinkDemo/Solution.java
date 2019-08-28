package LinkDemo;

import java.util.Scanner;

class LinkedListNode<T> {
	  public T data;
	  public LinkedListNode<T> next;
	   public LinkedListNode(T data) {
		this.data = data;
		this.next = null;
	   }
	   public T getData() {
		   return data;
	   }
	   public void setData(T data) {
		   this.data = data;
	   }
	}
public class Solution {
	  public static LinkedListNode<Integer> printMiddel(LinkedListNode<Integer> head) {
		    if(head == null) {
		    	return head;
		    }
	    	LinkedListNode<Integer> Slow = head , fast = head;
	    	while(fast.next != null && fast.next.next != null) {
	    		Slow = Slow.next;
	    		fast = fast.next.next;
	    	}
	    	return Slow;
	    }
	public static LinkedListNode<Integer> recursiveR(LinkedListNode<Integer> head){
		if(head == null || head.next != null) {
			return head;
		}
		LinkedListNode<Integer> finalHead = recursiveR(head.next);
		LinkedListNode<Integer> temp = finalHead;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = head;
		head.next = null;
		return finalHead;
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
	public static int length(LinkedListNode<Integer> head){
	      LinkedListNode<Integer> temp = head;
	      int count = 0;
	      while(temp != null){
	           count++;
	          temp = temp.next;
	      }
		  return count;	
		}
    public static void print(LinkedListNode<Integer> head) {
    	LinkedListNode<Integer> temp = head;
    	while(temp != null) {
    		System.out.print(temp.data+" ");
    		temp = temp.next;
    	}
    	System.out.println();
    }
    public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
    	if(head == null)
    	{
    		return null;
    	}
        LinkedListNode<Integer> temp = head;
        while(temp.next != null) {
        	if(temp.data.equals(temp.next.data)) {
        		temp.next = temp.next.next;
        	}else {
        		temp = temp.next;
        	}
        }
   
        return head;
    }
	public static LinkedListNode<Integer> deleteIthNodeRec(LinkedListNode<Integer> head, int i){
		if(head == null) {
			return head;
		}
		if(i == 0) {
			return head.next;
		}
		head.next = deleteIthNodeRec(head.next, i-1);
		return head;
	}
    public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head , int pos , int ele){
    	if(pos == 0) {
    		LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(ele);
    		newNode.next = head;
    		return newNode;
    	}
    	if(head == null) {
    		return head;
    	}
    	head.next = insert(head.next , pos-1 , ele);
    	return head;
    }
    public static LinkedListNode<Integer> append(LinkedListNode<Integer> root, int n) {
        LinkedListNode<Integer> head1 = root;
        LinkedListNode<Integer> head2 = root;
        int i = 1;
        int length = 1;
            while(head2.next != null) {
            	length++;
            	head2 = head2.next;
            }
        	while(i < length-n)
        	{   
        		i++;
        		head1 = head1.next;
        	}
             head2.next = root;
             root = head1.next;
             head1.next = null;
           //System.out.println(head2.data);
            return root	;
       }
    public static LinkedListNode<Integer> deleteIthNode(LinkedListNode<Integer> head , int i){
    	int count = 0;
    	LinkedListNode<Integer> temp = head;
    	if(i == 0) {
    		head = head.next;
    		return head;
    	}
    	while(count < i-1) {
    		temp = temp.next;
    		count++;
    	}
    	temp.next = temp.next.next;
    	return head;
    }
    public static void printReverseRecursive(LinkedListNode<Integer> root) {
      if(root == null) {
    	  return;
      }
      printReverseRecursive(root.next);
      System.out.print(root.data+" ");
    }
    public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
		if(head == null || head.next == null) {
			return head;
		}
		LinkedListNode<Integer> middle , middlenext;
		middle = printMiddel(head);
		//System.out.println(middle.data);
		middlenext = middle.next;
		middle.next = null;
	    LinkedListNode<Integer> head1 = mergeSort(head);
		LinkedListNode<Integer> head2 = mergeSort(middlenext);	
		LinkedListNode<Integer> head3 = mergeTwoList(head1, head2);
		return head3;
	}
    public static LinkedListNode<Integer> reverse3(LinkedListNode<Integer> head){
    	if(head == null || head.next == null ) {
    		return head;
    	}
    	LinkedListNode<Integer> reversedtail = head.next;
    	LinkedListNode<Integer> smallHead = reverse3(head.next);
    	reversedtail.next = head;
    	head.next = null;
    	return smallHead;
    	
    }
    public static LinkedListNode<Integer> Recursive(LinkedListNode<Integer> root){
    	LinkedListNode<Integer> prev = null;
    	LinkedListNode<Integer> current = root;
    	LinkedListNode<Integer> next = null;
    	while(current != null) {
    		next = current.next;
    		current.next = prev;
    		prev = current;
    		current = next;
    	}
    	root = prev;
    	return root;
    }
    public static LinkedListNode<Integer> mergeTwoList(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
	  if(head1 == null) {
		  return head2;
	  }
	  if(head2 == null) {
		  return head1;
	  }
    	LinkedListNode<Integer> t1 = head1 , t2 = head2 , head3 , tail3 ;
       if(t1.data <= t2.data) {
    	   head3 = t1;
		   tail3 = t1;
		   t1 = t1.next;
	   }else {
		   head3 = t2;
		   tail3 = t2;
		   t2 = t2.next;
	   }
      while(t1 != null && t2 != null) {  
  	   if(t1.data <= t2.data) {
    		   //System.out.print(t1.data+" ");
    		   tail3.next = t1;
    		   tail3 = t1;
    		   t1 = t1.next;
    	   }else {
    		   tail3.next = t2;
    		   tail3 = t2;
    		   t2 = t2.next;
    	   }
       }
      if(t1 != null) {
    	  tail3.next = t1;
      }
      if(t2 != null) {
    	  tail3.next = t2;
      }
		return head3;
	}
    public static boolean isPalindrome_2(LinkedListNode<Integer> head) {
        int length = length(head);
        int mid = length/2;
        boolean istrue = true;
        //System.out.println(mid);
        LinkedListNode<Integer> temp = head;
        int i = 0;
        while(i < mid-1) {
        	//System.out.print(temp.data+" ");
        	temp = temp.next;
        	//System.out.print(temp.data+" ");
        	i++;
        }
        LinkedListNode<Integer> newlink = Recursive(temp.next);
        temp.next = null;
        while(head != null) {
        	//System.out.print(head.data+" ");
        	if(newlink.data != head.data) {
        		return false;
        	}
        	newlink = newlink.next;
        	head = head.next;
        }

        return istrue;
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
	   LinkedListNode<Integer> head = takeInput();
	   head = deleteIthNodeRec(head, 2);
	   print(head);
	}

}
