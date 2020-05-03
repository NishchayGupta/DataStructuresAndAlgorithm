package doublyLinkedListLeet;

public class DoublyLinkedListTest {

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insertAtFirst(5);
		dll.insertAfter(5, 10);
		dll.insertAfter(5, 15);
		dll.displayForward();
		dll.displayBackward();
		dll.deleteKey(15);
		dll.displayForward();
		dll.displayBackward();
		dll.deleteLast();
		dll.displayForward();
		dll.displayBackward();
	}
}