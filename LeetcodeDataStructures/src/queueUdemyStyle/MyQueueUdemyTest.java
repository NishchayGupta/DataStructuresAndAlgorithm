package queueUdemyStyle;

public class MyQueueUdemyTest {

	public static void main(String[] args) {
		MyQueueUdemy myQueue = new MyQueueUdemy(4);
		myQueue.insert(2);
		myQueue.insert(4);
		myQueue.insert(6);
		myQueue.insert(8);
		System.out.println("Front:    " + myQueue.front);
		System.out.println("nItems:  "  +myQueue.nItems);
		System.out.println("maxSize:  "  +myQueue.maxSize);
		System.out.println("Full ? --> " + myQueue.isFull());
		System.out.println("Removing: " + myQueue.remove());
		System.out.println("nItems:  "  +myQueue.nItems);
		myQueue.insert(8);
		System.out.println("rear:  " + myQueue.rear);
		System.out.println("nItems:  "  +myQueue.nItems);
		System.out.println("Front:    " + myQueue.front);
		myQueue.display();
		
	}
}