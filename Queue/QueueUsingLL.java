
public class QueueUsingLL<T> {
  
  private Node<T> front;
  private Node<T> rear;
  int size;
  
  public QueueUsingLL() {
	front = null;
	rear = null; 
	size = 0;
  }
  
  int size() {
	return size;  
  }
  
  boolean isEmpty() {
	return(size == 0);  
  }
  
  T front() throws QueueEmptyException{
	 if(front == null) {
		 throw new QueueEmptyException();
	 }
	 return front.data;
  }
  
  void enqueue(T element) {
	  Node<T> newNode = new Node<T>(element);
	  newNode.next = null;
	  if(front == null) {
		  front = newNode;
		  rear = newNode;
		  size++;
		  return;
	  }
	  rear.next = newNode;
	  rear = newNode;
	  size++;
  }
  
  T dequeue() throws QueueEmptyException {
	  if(size == 0) {
		  throw new QueueEmptyException();
	  }
	  T delData = front.data;
	  front = front.next;
	  if(size == 1) {
		  rear = null;
	  }
	  size--;
	  return delData;
  }
  
}
