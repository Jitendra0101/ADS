package DoublyLinearLinkedList;

public class DoublyLinkedList {

	static Node head;

	public static class Node {
		String data;
		Node next;
		Node prev;

		public Node(String data) {
			this.data = data;
			this.next = null;
			this.prev = null;

		}
	}

	public static boolean isListEmpty() {
		return head == null;
	}

	public static void displayListForward() {
		if (isListEmpty()) {
			System.out.println("List is empty ");
		} else {
			Node trav = head;
			while (trav != null) {
				System.out.print(trav.data + "->");
				trav = trav.next;
			}
		}

	}

	public static void displayReverse() {
		if (isListEmpty()) {
			System.out.println("List is empty ");
		} else {
			Node trav = head;
			while (trav.next != null) {
				trav = trav.next;
			}
			while (trav != null) {
				System.out.print(trav.data + "->");
				trav = trav.prev;
			}
		}

	}

	public static void addFirst(String data) {
		Node newNode = new Node(data);
		if (isListEmpty()) {
			head = newNode;
			System.out.println("Element added : " + newNode.data);

		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
			System.out.println("Element added : " + newNode.data);

		}

	}

	public static void addLast(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node trav = head;
			while (trav.next != null) {
				trav = trav.next;
			}
			trav.next = newNode;
			newNode.prev = trav;
		}

	}

	public static void addAtPos(int pos, String data) {
		Node newNode = new Node(data);
		if (head == null || pos <= 1) {
			addFirst(data);
		} else {
			Node trav = head;
			for (int i = 1; i < pos - 1; i++) {
				if (trav.next == null)
					break;
				trav = trav.next;
			}
			Node temp = trav.next;
			newNode.prev = trav;
			newNode.next = temp;
			if (temp != null) {
				temp.prev = newNode;
			}
			trav.next = newNode;
			System.out.println("Element added at pos " + pos + " : " + newNode.data);
		}

	}

	public static void delFirst() {
		if (isListEmpty()) {
			System.out.println("List is empty ");
		}

		else if (head.next == null) {
			String delValue = head.data;
			head = null;
			System.out.println("Value deleted from list " + delValue);
		} else {
			String delValue = head.data;
			head = head.next;
			head.prev = null;
			System.out.println("Value deleted from list " + delValue);
		}

	}

	public static void deleteAtPosition(int pos) {
		if(head==null || pos<1)
		{
			throw new RuntimeException("List is empty or invalid position");
		}
		else if(pos==1) {
			delFirst();
		}
		else {
			Node trav = head;
			for(int i = 0 ;i<pos-1;i++) {
				
				if(trav==null)
					throw new RuntimeException("Invalid positon");
				trav=trav.next;
			}
			String delValue=trav.data;
			trav.prev.next=trav.next;
			if(trav.next!=null)
				trav.next.prev=trav.prev;
			System.out.println("Value deleted from list " + delValue);
					
			
		}
		

	}

	public static void deletLast() {
		if(head==null)
		{
			System.out.println("List is empty ");
		}
		else
		{
			Node trav = head;
			while(trav.next!=null)
			{
				trav=trav.next;
				
			}
			trav.prev.next=null;
			System.out.println("Element deleted from list : "+trav.data);
		}

	}

	public static void deleteAll() {
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else
			head=null;

	}
}
