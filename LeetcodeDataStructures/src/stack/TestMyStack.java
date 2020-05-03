package stack;

public class TestMyStack {

	public static void main(String[] args) {
		MyStack myStack = new MyStack(4);
		System.out.println(myStack.push(8));
		System.out.println(myStack.push(6));
		System.out.println(myStack.push(4));
		System.out.println(myStack.push(2));
		System.out.println(myStack.push(10));
		System.out.println("Full ?    " + myStack.isFull());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.peak());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println("Empty ?    " + myStack.isEmpty());
	}
}