package stack;

public class MyStack {

	int size;
	long[] stack;
	int top;
	
	public MyStack(int x) 
	{
		this.stack = new long[x];
		this.top = -1;
	}
	
	public boolean push(long elmt)
	{
		if(isFull() == true)
		{
			return false;
		}
		else
		{
			top++;
			stack[top] = elmt;
			return true;
		}
	}
	
	public long pop()
	{
		if(isEmpty() == true)
		{
			return -1;
		}
		else
		{
			long x = stack[top];
			top--;
			return x;
		}
	}
	
	public long peak()
	{
		if(isEmpty() == true)
		{
			return -1;
		}
		else
			return stack[top];
	}
	
	public boolean isEmpty()
	{
		if(top == -1)
		{
			return true;
		}
		return false;
	}
	
	public boolean isFull()
	{
		if(top == stack.length-1)
		{
			return true;
		}
		return false;
	}
}
