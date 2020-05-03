package circularLinkedList;

public class MyCircularLinkedList {
	
	Node first;
	Node last;
	
	public boolean isEmpty()
	{
		return (first == null && last == null);
	}
	
	public boolean insertAtFirst(int x)
	{
		Node newNode = new Node();
		newNode.data = x;
		if(isEmpty())
		{
			last = newNode;
		}
		newNode.next = first;
		first = newNode;
		return true;
	}
	
	public boolean insertAfter(int val, int y)
	{
		if(isEmpty() != true)
		{
			Node newNode = new Node();
			Node current = first;
			while(current.data != val)
			{
				current = current.next;
			}
			newNode.data = y;
			if(current == last)
			{
				current.next = newNode;
				last = newNode;
			}
			else
			{
				Node temp = current.next;
				current.next = newNode;
				newNode.next = temp;
			}
			return true;
		}
		return false;
	}
	
	public Node deleteFirst()
	{
		if(isEmpty() != true)
		{
			Node temp = first;
			if(first == last)
			{
				last = null;
			}
			first = temp.next;
			return temp;
		}
		return null;
	}
	
	public void displayList()
	{
		if(isEmpty() == false)
		{
			System.out.println("First --> " + first.data);
			Node current = first;
			while(current.next != null)
			{
				System.out.println(current.data);
				current = current.next;
			}
			System.out.println(current.data);
		}
	}
	
	/*public Node delete(int val)
	{
		if(isEmpty() != true)
		{
			Node current = first;
			while(current.next.data != val)
			{
				current = current.next;
			}
			Node temp = first;
			if(current == first)
			{
				if(current == last)
				{
					last = null;
				}
				first = temp.next;
				return temp;
			}
		}
		return null;
	}*/
}