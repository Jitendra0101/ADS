package LinkedList;

import java.util.Scanner;

public class SCircLL {

	Node head;

	static class Node {
		private int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void display() {
		Node trav = head;
		System.out.println("Elements of CircularLL are: ");
		if (isEmpty()) {
			System.out.println("List is empty...");
		} else {
			do {
				System.out.print(trav.data + "->");
				trav = trav.next;
			} while (trav != head);
		}
	}

	public void addLast(int val) {
		Node newNode = new Node(val);
		Node trav = head;
		System.out.println("Add element at last: ");
		if (isEmpty()) {
			head = newNode;
			newNode.next = head;
		} else if (head.next == head) {
			head.next = newNode;
			newNode.next = head;
		} else {
			do {
				trav = trav.next;
			} while (trav.next != head);
			trav.next = newNode;

		}
		newNode.next = head;

	}

	public void addFirst(int val) {
		Node newNode = new Node(val);
		Node trav = head;
		System.out.println("Add element at last: ");
		if (isEmpty()) {
			head = newNode;
			newNode.next = head;
		} else if (head.next == head) {
			head.next = newNode;
			newNode.next = head;
		} else {
			do {
				trav = trav.next;
			} while (trav.next != head);
			trav.next = newNode;

		}
		newNode.next = head;
		head = newNode;
	}

	public void addPosition(int val, int pos) {
		Node newNode = new Node(val);
		Node trav = head;
		if (head == null || pos < 1) {
			addFirst(val);
		} else {
			for (int i = 1; i < pos - 1; i++) {
				if (trav.next == head)
					break;
				trav = trav.next;
			}
			newNode.next = trav.next;
			trav.next = newNode;

		}
	}

	public void delFirst() {

		if (isEmpty()) {
			System.out.println("List is empty...");
		}
		else if (head.next == head) {
			head = null;
		} else {
			Node trav = head;
			
			while (trav.next != head) {
				trav = trav.next;
			}
			head = head.next;
			trav.next = head;
		}

	}

	public void delAll() {
		if (head == null) {
			System.out.println("List is empty...");
		}
		head.next=null;
		head = null;
	}

	public void delPos(int pos) {
		Node temp = null;
		Node trav = head;

		if (pos == 1)
			delFirst();

		if (head == null || pos < 1)
			throw new RuntimeException("List empty or invalid pos.");

		for (int i = 1; i < pos; i++) {
			if (trav.next == head) {
				throw new RuntimeException("Invalid position");
			}
			temp = trav;
			trav = trav.next;
		}
		temp.next = trav.next;
	}

	public void delLast() {
		Node trav = head;
		Node sLast = null;
		while (trav.next != head) {
			sLast = trav;
			trav = trav.next;
		}
		sLast.next =head;

	}

	public static void main(String[] args) {
		SCircLL cList = new SCircLL();
		boolean exit = false;
		Scanner sc = new Scanner(System.in);
		while (!exit) {
			System.out.println(
					"\nMenu: \n1.display \n2.Add last \n3.Add First \n4.Add at position \n5.Delete First \n6.Delete all \n7.Delete position \n8.Delete last");
			switch (sc.nextInt()) {
			case 1:// display
				cList.display();
				break;

			case 2:// Add last
				System.out.println("Enter element to be added at last position: ");
				cList.addLast(sc.nextInt());
				break;

			case 3:// Add First
				System.out.println("Enter element to be added at 1st position : ");
				cList.addFirst(sc.nextInt());
				break;

			case 4:// Add at a position
				System.out.println("Enter value and position: ");
				cList.addPosition(sc.nextInt(), sc.nextInt());
				break;

			case 5:
				try {
					cList.delFirst();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;

			case 6:
				cList.delAll();
				break;

			case 7:
				System.out.println("Enter position from where element is to be deleted: ");
				try {
					cList.delPos(sc.nextInt());
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;

			case 8:
				cList.delLast();
				break;

			case 9:
				exit = true;
				break;
			}

		}

	}

}
