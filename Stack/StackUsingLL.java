 
public class StackUsingLL<T> {
 private Node<T> head;
 private int size;
 
  public StackUsingLL() {
	head = null;
	size = 0;
  }
  
  int size() {
	  return size;
  }
  
  T top() throws StackEmptyException{
	  if(head == null) {
		  StackEmptyException e = new StackEmptyException();
		  throw e;
	  }
	 return head.data; 
  }
  
  boolean isEmpty() {
	  if(size <= 0) {
		  return true;
	  }
	  return false;
  }
  
  void push(T element) {
	  Node<T> newNode = new Node<T>(element);
	  if(head == null) {
		  head = newNode;
		  newNode.next = null;
		  size++;
		  return;
	  }
	  newNode.next = head;
	  head = newNode;
	  size++;  
  }
  
    T pop() throws StackEmptyException{
	  if(head == null) {
		  StackEmptyException e = new StackEmptyException();
		  throw e;
	  }
	  T data = head.data;
	  head = head.next;
	  size--;
	return data;
  }
  
}
