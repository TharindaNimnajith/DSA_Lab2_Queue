package dsa;

public class QueueX {
	private int queueArr[];
	private int maxSize;
	private int rear;
	private int front;
	private int noItems;
	
	public QueueX(int s) {
		maxSize = s;
		queueArr = new int[maxSize];
		rear = -1;
		front = 0;
		noItems = 0;
	}
	
	public void insert(int j) {
		if(isFull()) {
			System.out.println("Queue is Full");
		}
		else {
			noItems++;
			rear++;
			queueArr[rear] = j;
		}
	}
	
	public int remove() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -99;
		}
		else {
			noItems--;
			int temp = queueArr[front];
			front++;
			return temp;
		}
	}
	
	public boolean isEmpty() {
		if(noItems == 0) 
			return true;
		else
			return false;
	}
	
	public boolean isFull() {
		if(rear == maxSize - 1) 
			return true;
		else
			return false;
	}
}
