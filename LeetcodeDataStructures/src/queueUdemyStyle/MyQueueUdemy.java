package queueUdemyStyle;

public class MyQueueUdemy {

	int nItems;
	int maxSize;
	int[] data;
	int front;
	int rear;
	
	public MyQueueUdemy(int size)
	{
		maxSize = size;
		data = new int[size];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	public void insert(int x)
	{
		if(rear == (maxSize-1))
		{
			rear = -1;
		}
		rear++;
		data[rear] = x;
		nItems++;
	}
	
	public boolean remove()
	{
		if(isEmpty() == true)
		{
			return false;
		}
		else
		{
			int temp = data[front];
			front++;
			if(front == maxSize)
			{
				front = 0;
			}
			nItems--;
			return true;
		}
	}
	
	public void display()
	{
		for(int i=0; i<data.length; i++)
		{
			System.out.println(data[i]);
		}
	}
	
	public boolean isEmpty()
	{
		return (nItems == 0);
	}
	
	public boolean isFull()
	{
		return (nItems == maxSize);
	}
}