package simple_queue;

public class Tester {

	public static void main(String[] args) {
		
		SimpleQueue one = new Queue(10);
		
		one.push(11);
		one.push(13);
		one.push(12);
		one.pop();
		one.display();
		one.push(25);
		System.out.println("after pushing 25");
		one.display();
		System.out.println("after poping 13");
		one.pop();
		one.display();
	}

}
