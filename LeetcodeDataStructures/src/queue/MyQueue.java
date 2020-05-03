package queue;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {

	List<Integer> data;
	int p_start;
	public MyQueue()
	{
		data = new ArrayList<>(5);
		p_start = 0;
	}
	
	public boolean enqueue(int x)
	{
		data.add(x);
		return true;
	}
	
	public boolean dequeue()
	{
		if(isEmpty() == false)
		{
			p_start++;
			return true;
		}
		else 
			return false;
	}
	
	public int front()
	{
		return data.get(p_start);
	}
	
	public boolean isEmpty()
	{
		return p_start >= data.size();
	}
}
