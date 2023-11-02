package circular_queue;

public class Tester {

	public static void main(String[] args) {
		
		CircularQueue circular = new Queue(5);
		circular.push(12);
		circular.push(45);
		circular.display();
		circular.pop();
		System.out.println("after pop");
		circular.display();
	
	
	}

}
