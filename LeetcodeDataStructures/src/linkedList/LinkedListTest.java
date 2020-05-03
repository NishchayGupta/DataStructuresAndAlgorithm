package linkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.insertAtFirst(5);
		ll.insertAfter(5, 10);
		ll.insertAfter(10, 15);
		System.out.println();
		System.out.println(ll.deleteFirst().data);
		System.out.println();
		ll.displayList();
	}
}