package linkedList;

public class LinkedList {
	
	Node first;
	
	public boolean isEmpty()
	{
		return (first == null);
	}
	
	public boolean insertAtFirst(int x)
	{
		if(isEmpty() == true)
		{
			Node newNode = new Node();
			newNode.data = x;
			newNode.next = first;
			first = newNode;
			System.out.println("First ka data --> " + first.data);
			return true;
		}
		return false;
	}
	
	public Node deleteFirst()
	{
		if(isEmpty() != true)
		{
			Node temp = first;
			System.out.println("delete first --> " + temp.next.data);
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
	
	public boolean insertAfter(int x, int y)
	{
		if(isEmpty() != true)
		{
			System.out.println("Inside if");
			Node current = first;
			while(current.data != x)
			{
				System.out.println("Inside while: " + current.data);
				current = current.next;
			}
			Node newNode = new Node();
			newNode.data = y;
			current.next = newNode;
			System.out.println(current.next.data);
			return true;
		}
		return false;
	}
}