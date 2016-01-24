//Implement Stack using array

class MyStack{
	private int [] stack;
	int top;
	
	//create a stack of size N
	MyStack(int N){
		stack = new int[N];
		top = 0;
	}
	
	//push an element into stack
	public void push(int element){
		stack[top] = element;
		top++;
	}
	
	//pop an element out of stack (return -1 if not found)
	public int pop(){
		if(top !=0)
			return stack[--top];
		else{
			System.err.println("Empty stack!");
			return -1;
		}
	}
	
	//display current size of stack
	public int size(){
		return top;
	}
	
	//check if stack is empty or not
	public boolean isEmpty(){
		if(top == 0)
			return true;
		else
			return false;
	}
	
	//display stack-Top
	public int peek(){
		if(top !=0)
			return stack[top-1];
		else{
			System.err.println("Empty stack!");
			return -1;
		}
	}
	
	//search for an element in the stack
	public int search(int element){
		for(int i =0; i<top; i++){
			if(stack[i]==element)
				return top-i;
		}
		return -1;
	}
}

public class StackUsingArray {
	public static void main(String args[]){
		/*
		Scanner sc = new Scanner(System.in);
		int stack_size = sc.nextInt();
		*/
		
		int STACK_SIZE = 10;
		
		//creating a stack of size 10
		MyStack stack = new MyStack(STACK_SIZE);
		
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
		if(stack.search(25) != -1)
			System.out.println("25 found in stack at : "+stack.search(25));

		if(stack.search(35) != -1)
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
