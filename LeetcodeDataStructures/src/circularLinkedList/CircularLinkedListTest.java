package circularLinkedList;

public class CircularLinkedListTest {

	public static void main(String[] args) {
		MyCircularLinkedList cll = new MyCircularLinkedList();
		cll.insertAtFirst(5);
		cll.insertAfter(5, 10);
		cll.insertAfter(10, 15);
		cll.displayList();
		System.out.println();
		System.out.println(cll.deleteFirst().data);
		System.out.println();
		cll.displayList();
	}
}