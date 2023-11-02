package circular_queue;

public class CircularQueue {
		private int front;
		private int rear ;
		private int queue[];
		private int size;
		
		public CircularQueue(int size) 
		{
			this.size = size;
			front =0;
			rear=0;
			queue = new int[size];
		}
		
		
		
		
		public boolean isempty()
		{
			return front == rear ;
		}
		
		public void push(int element) 
		{
			if(rear == front-1) {
				System.out.println("Queue is Full!");
			}
			queue[rear] = element;
			rear = (rear + 1)%size;
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
				int r = queue[front];
				front = (front +1) % size;
				return r;
			}
		}
		
		
		public void display() 
		{
			if(isempty()) 
			{
				System.out.println("Queue is Empty!");
				System.exit(0);
			}
			for (int i= front ; i <= rear-1 ; i++ ) {
				System.out.println(queue[i]);
			}
		}




}
