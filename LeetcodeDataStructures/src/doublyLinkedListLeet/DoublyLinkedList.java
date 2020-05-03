package doublyLinkedListLeet;

public class DoublyLinkedList {
	
	Node first;
	Node last;
	
	public boolean isEmpty()
	{
		return (first == null);
	}
	
	public boolean insertAtFirst(int val)
	{
		Node newNode = new Node();
		newNode.data = val;
		if(isEmpty())
		{
			last = newNode;
		}
		else
			first.prev = newNode;
		newNode.next = first;
		first = newNode;
		return true;
	}
	
	public boolean insertLast(int val)
	{
		Node newNode = new Node();
		newNode.data = val;
		if(isEmpty())
		{
			last = newNode;
		}
		else
		{
			last.next = newNode;
			newNode.prev = last;
		}
		last = newNode;
		return true;
	}
	
	public Node deleteFirst()
	{
		if(last != first && isEmpty() != true)
		{
			Node temp = first.next;
			first.next.prev = null;
			first = first.next;
			return temp;
		}
		else
			last = null;
		return null;
	}
	
	public Node deleteLast()
	{
		Node temp = last;
		if(last != first && isEmpty() != true)
		{
			last.prev.next = null;
		}
		else 
		{
			first = null;
		}
		last = last.prev;
		return temp;
	}
	
	public boolean insertAfter(int val, int y)
	{
		Node current = first;
		if(isEmpty() != true)
		{
			while(current.data != val)
			{
				current = current.next;
				if(current.next == null)
					return false;
			}
			Node newNode = new Node();
			newNode.data = y;
			if(current == last)
			{
				current.next = newNode;
				newNode.prev = last;
				last = newNode;
			}
			else
			{
				
				newNode.next = current.next;
				current.next = newNode;
				newNode.prev = newNode.next.prev;
				newNode.next.prev = newNode;
			}
		}
		return true;
	}
	
	public boolean deleteKey(int key)
	{
		Node current = first;
		if(isEmpty() != true)
		{
			while(current.data != key)
			{
				current = current.next;
				if(current.next == null)
				{
					return false;
				}
			}
			if(current == first)
			{
				first = current.next;
			}
			else if(current == last)
			{
				last = current.prev;
			}
			else 
			{
				current.next.prev = current.prev;
				current.prev.next = current.next;
			}
		}
		return true;
	}
	
	// display forward
		public void displayForward()
		{
			System.out.println("List --> First.........Last");
			Node current = first;
			while(current != null)
			{
				current.displayNode();
				current = current.next;
			}
		}
		
		// display forward
		public void displayBackward()
		{
			System.out.println("List --> Last.........First");
			Node current = last;
			while(current != null)
			{
				current.displayNode();
				current = current.prev;
			}
		}
}