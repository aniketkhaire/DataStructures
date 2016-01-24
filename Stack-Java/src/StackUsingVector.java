//stack using List
import java.util.Vector;

//Implement Stack using array

class MyStackForVector{
	private Vector<Integer> stack;
	int capacity;
	//create a stack
	MyStackForVector(int N){
		stack = new Vector<Integer>();
		capacity = N;
	}
	
	//push an element into stack
	public void push(int element){
		if(capacity > stack.size())
			stack.add(element);
		else
			System.err.println("Stack overflow !");
	}
	
	//pop an element out of stack (return -1 if not found)
	public int pop(){
		if(stack.size() !=0)
			return stack.remove(stack.size()-1);
		else{
			System.err.println("Empty stack!");
			return -1;
		}
	}
	
	//display current size of stack
	public int size(){
		return stack.size();
	}
	
	//check if stack is empty or not
	public boolean isEmpty(){
		return stack.isEmpty();
	}
	
	//display stack-Top
	public int peek(){
		if(stack.size() !=0)
			return stack.get(stack.size()-1);
		else{
			System.err.println("Empty stack!");
			return -1;
		}
	}
	
	//search for an element in the stack
	public boolean search(int element){
		return stack.contains(element);
	}
}

public class StackUsingVector {
	public static void main(String args[]){
		/*
		Scanner sc = new Scanner(System.in);
		int stack_size = sc.nextInt();
		*/
		
		int STACK_SIZE = 10;
		
		//creating a stack of size 10
		MyStackForVector stack = new MyStackForVector(STACK_SIZE);
		
		//current size of stack
		System.out.println(stack.size());
		
		//pushing elements into stack;
		stack.push(1);
		stack.push(2);
		
		//display stack top
		System.out.println(stack.peek());
		
		//popping element from stack
		stack.pop();
		
		//display stack top
		System.out.println(stack.peek());
		
		stack.push(5);
		stack.push(25);
		stack.push(565);
		stack.push(78);
		stack.push(2);
		
		//search for an element
		if(stack.search(25))
			System.out.println("25 found in stack at : "+stack.search(25));

		if(stack.search(35))
			System.out.println("35 found in stack at :"+stack.search(35));
		else
			System.out.println("35 NOT found in stack.");
		
		//popping		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}
}
