package stack;

public class Stack {
	private int top;
	private int stack[];
	
		public Stack(int size) 
			{
			top=-1;
			stack = new int[size];
			}
		
		
		public boolean isfull() {
			return top == stack.length-1;
		}
		
		public boolean isEmpty() {
			return top < 0;
		}
		
		public  void push (int element) {
			if(isfull()) {
				System.out.println("Stack is Full!");
			}
			else 
			{
				++top;
				stack[top] = element;
			}}

		
			public int pop () 
					{
						if(isEmpty()
						{
							System.out.println("Stack is Empty");
							return 0;
						}
				
					return stack[top--];
					}
			
			public int peek() {
				return stack[top];
			}
			
			public void display() {
				for(int i =0 ; i<= top; i++) {
					System.out.println(stack[i]);
				}
			}



}
