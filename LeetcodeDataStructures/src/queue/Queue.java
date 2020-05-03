package queue;

public class Queue {

	public static void main(String[] args) {
		MyQueue q = new MyQueue();
        q.enqueue(5);
        q.enqueue(3);
        if (q.isEmpty() == false) {
            System.out.println(q.front());
        }
        q.dequeue();
        if (q.isEmpty() == false) {
            System.out.println(q.front());
        }
        q.dequeue();
        if (q.isEmpty() == false) {
            System.out.println(q.front());
        }
	}
}