package SinglyLinearLinkedList_WithTail;

public class LinkedList {
	
	static Node head;
	static Node tail;
	
	public static class Node{
		String data;
		Node next;
		public Node(String data)
		{
			this.data=data;
			this.next=null;
			
		}		
	}
	
	public static boolean isListEmpty() {
		return head==null;
	}
	
	public static void  displayList() {
		if(head==null) {
			System.out.println("List is empty");
		}
		else {
			System.out.println("List : ");
			Node trav=head;
			while(trav!=null)
			{
				
				System.out.print(trav.data+" ->");
				trav=trav.next;
			}
		}
		System.out.println(" ");
	}
	
	
	
	public static void addFirst(String data) {
		Node newNode =  new Node(data);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
			System.out.println("Element added  : "+newNode.data);
		}
		else
		{
			newNode.next=head;
			head=newNode;
			System.out.println("Element added at first : "+newNode.data);
		}
	}
	
	
	public static void addLast(String data)
	{
		Node newNode = new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
			System.out.println("Element added : "+newNode.data);
		}
		else {
			tail.next=newNode;
			tail=newNode;
			System.out.println("Element added at last : "+newNode.data);
		}
	}
		
	
	public static void addAtPos(int pos,String data)
	{
		Node newNode = new Node(data);
		if(head==null || pos<=1 )
		{
			addFirst(data);
		}
		else
		{
			Node trav = head;
			for(int i = 1; i<pos-1;i++) {
				if(trav.next==null)
					break;					
				trav=trav.next;
			}
			newNode.next=trav.next;
			trav.next=newNode;
			
		}
	}
	
	public static void delFirst() {
		if(head==null)
		{
			System.out.println("List is empty ");
		}
		else
		{
			head=head.next;		
		}
	}
	
	public static void deleteAtPosition(int pos) {
		if(head==null || pos<1)
		{
			throw new RuntimeException("List is empty or Invalid Position");
		}
		else if(pos==1) {
			delFirst();
		}
		else
		{
			Node trav=head;
			Node temp = null;
			for(int i =1;i<pos;i++)
			{
				if(trav==null)
				{
					throw new RuntimeException("Invalid position");
				}
				temp=trav;
				trav=trav.next;
			}
			temp.next=trav.next;
		}
	}
	
	public static void deletLast()
	{
		if(head==null)
		{
			System.out.println("List is empty ");
		}
		else
		{
			Node secondLast = head;
			Node Last = head.next;
			while(Last.next!=null)
			{
				Last=Last.next;
				secondLast =  secondLast.next;
			}
			secondLast.next=null;
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

	


