package simple_queue;

public class SimpleQueue{
		private int queue[];
		private int front;
		private int rear ;
		private int capacity;
		
		
		
		public SimpleQueue(int size) {
			queue = new int[size];
			front =0;
			rear =0;
			this.capacity = size;
		}
		
		
		public boolean isfull() {
			return rear == capacity;
		}
		
		public boolean isempty() {
			return front == rear;
		}
		
		
		public void push (int element) 
		{
			if(isfull()) 
			{
				System.out.println("Queue is Full !");
			}
			else
			{
				queue[rear] = element;
				++rear;
			}
		}
		
		
		
		public int pop () 
		{
			if(isempty()) 
			{
				System.out.println("Queue is Empty!");
				return 0;
			}
			else
			{
				return queue[front++];
			}
		}
		
		
		public void peek() 
		{
			System.out.println(queue[front]);
		}
		
		
		
		public void display() 
		{
			for(int i=front; i <= rear-1;i++) {
				System.out.println(queue[i]);
			}
		}








}
