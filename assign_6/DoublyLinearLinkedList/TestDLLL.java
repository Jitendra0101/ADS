package DoublyLinearLinkedList;

import java.util.Scanner;

import DoublyLinearLinkedList.DoublyLinkedList;

public class TestDLLL {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DoublyLinkedList list = new DoublyLinkedList();
		
		boolean flag = false;
		while (!flag) {
			System.out.println("\nMenu :\n1.add at first");
			System.out.println("2.Add at last");
			System.out.println("3.Add element at position");
			System.out.println("4.Delete element at first position");
			System.out.println("5.Delete at Last");
			System.out.println("6.Delete at positon");
			System.out.println("7.Delete All list element");
			System.out.println("8.Display all list in forward manner");
			System.out.println("9.Display all list in reverse manner");
			System.out.println("0.exit");
			System.out.println("enter your choice : ");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("Enter data to be added in list at first position : ");
				list.addFirst(sc.next());
				

				break;
				
			case 2:

				System.out.println("Enter data to be added in list at last positon : ");
				list.addLast(sc.next());
				break;
			case 3:
				System.out.println("Enter  the position and data to be added in list ");
				list.addAtPos(sc.nextInt(), sc.next());
				

				break;
			case 4:
				list.delFirst();
				

				break;

			case 5:
				list.deletLast();
				
				break;
				
			case 6:
				
				try {
					System.out.println("Enter the positon of element to be deleted");
					list.deleteAtPosition(sc.nextInt());
				}catch (Exception e)
				{
					System.out.println(e.getMessage());
				}
					
				
				
				break;
			case 7:
				list.deleteAll();
				

				break;
			case 8:
				list.displayListForward();			

				break;
			case 9:
				list.displayReverse();

				break;

			case 0:
				flag = true;
				break;

			default:
				break;
			}
		}

	}

}
