package doubly_circular_LL;

import java.util.*;

class Main {
	static MyNode head;
	static MyNode tail;

	static class MyNode {
		int data;
		MyNode next;
		MyNode prev;
	}

	static void insertAtFront(int value) {

//		if (tail == null) {
//			MyNode new_node = new MyNode();
//			new_node.data = value;
//			new_node.next = new_node.prev = new_node;
//			tail = new_node;
//			new_node.next = head;
//			return;
//		}

		head = (tail).next;
		MyNode new_node = new MyNode();
		new_node.data = value;
		new_node.prev = tail;
		(tail).next = new_node;
		new_node.next = head;
		head.prev = new_node;
		head = new_node;

	}

	static void insertAtBack(int value) {
		if (head == null) {
			MyNode new_node = new MyNode();
			new_node.data = value;
			new_node.next = new_node.prev = new_node;
			head = new_node;
			return;
		}

		tail = (head).prev;
		MyNode new_node = new MyNode();
		new_node.data = value;
		new_node.next = head;
		(head).prev = new_node;
		new_node.prev = tail;
		tail.next = new_node;
		tail = new_node;
	}

	static int deleteFromFront() {

		int value = head.data;
		head = head.next;
		tail.next = head;
		head.prev = tail;
		return value;
	}

	static int deleteFromBack() {

		int value = tail.data;
		tail = tail.prev;
		head.prev = tail;
		tail.next = head;

		return value;
	}

	static int deleteNode(int index) {
		if(index>(size()-1))
			return -1;
		
		MyNode pos = new MyNode();
		pos = head;
		
		if (index==0) {
			
			int value = head.data;
			
			MyNode temp = head.prev;
			head = head.next;
			temp.next = head;
			head.prev = temp;
			
			return value;
		}	
	
		else
		{
			for(int i = 0; i < index ; i ++) {
				
				pos = pos.next;
				
			}	
		}
		
		int value = pos.data;
		MyNode temp1 = pos.prev;
		temp1.next = pos.next;
		MyNode temp2 = pos.next;
		temp2.prev = pos.prev; 
		

		return value;
	}

	static void printInReverse() {
		MyNode temp = head;
		System.out.print("\nCircular doubly linked list printed backward: \n");
		MyNode tail = head.prev;
		temp = tail;
		while (temp.prev != tail) {
			System.out.print(temp.data + " ");
			temp = temp.prev;
		}
		System.out.print(temp.data + " ");
		System.out.println();
	}

	static void printNodes() {
		MyNode temp = head;
		while (temp.next != head) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.print(temp.data + " ");
	}

	static void display_menu() {
		System.out.println("\n \n==============================================");
		System.out.println(" \t \t Menu:");
		System.out.println("==============================================");
		System.out.println(" 1. Insert At Front");
		System.out.println(" 2. Insert At Back");
		System.out.println(" 3. Delete From Front");
		System.out.println(" 4. Delete From Back");
		System.out.println(" 5. Delete A Node(By Index)");
		System.out.println(" 6. Add A Node(By Index)");
		System.out.println(" 7. Search for a element");
		System.out.println(" 8. Reverse the list");
		System.out.println(" 0. Exit");
		System.out.println("==============================================");
	}

	static int size() {

		MyNode index = new MyNode();
		index = head;
		int size = 0;

		while (!(index.next == head)) {
			index = index.next;
			size++;
		}

		return size + 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		insertAtBack(40);
		insertAtBack(50);
		insertAtBack(60);
		insertAtBack(70);
		insertAtBack(80);

		System.out.print("\nCircular doubly linked list: ");
		printNodes();

		System.out.println("\nSize: " + size() + "| Head is: " + head.data + "| Tail is: " + tail.data);

		boolean flag = false;
		display_menu();
		while (!flag) {
			try {

				System.out.println("\nEnter your choice: ");
				switch (sc.nextInt()) {

				case 1:
					System.out.print("Enter Element you want to add into the list: ");
					System.out.println();
					insertAtFront(sc.nextInt());
					System.out.println("\nsuccessfully added !! \nupdated List is: ");
					printNodes();
					break;

				case 2:
					System.out.print("Enter Element you want to add into the list: ");
					System.out.println();
					insertAtBack(sc.nextInt());
					System.out.println("\nsuccessfully added !! \nupdated List is: ");
					printNodes();
					break;

				case 3:
					System.out.println("The removed value is: " + deleteFromFront());
					System.out.print("Updated list is: ");
					printNodes();
					break;

				case 4:
					System.out.println("The removed value is: " + deleteFromBack());
					System.out.print("Updated list is: ");
					printNodes();
					break;

				case 5:
					System.out.print("Enter the Index of the Node to be DELETED: ");
					System.out.println();
					int value = deleteNode(sc.nextInt());

					if (value != -1) {
						System.out.println("Deleted value is: " + value + ". Updated list is: ");
						printNodes();
					}
					else
						System.out.println("Index is out of bounds !!");
					
					break;

				case 7:
					printInReverse();
					break;

				case 0:
					System.out.println("\n Exiting ...");
					flag = true;
					break;

				default:
					System.out.println("Wrong input, try again..");
					break;
				}
			} catch (Exception e) {
				System.out.println("exception found !!");
				e.printStackTrace();
				sc.nextLine();
			}
		}
		sc.close();
	}
}