package SinglyLinearLinkedList_WithTail;

import java.util.Scanner;

public class TestSLLL {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LinkedList listSL = new LinkedList();

		boolean flag = false;
		while (!flag) {
			System.out.println("\nMenu :  \n1.add at first\n2.Add at last\n3.Add element at position \n4.Delete element at first position\n5.Delete at Last\n6. Delete at positon\n7.Delete All list element\n8.Display all list \n0.exit");
			System.out.println("enter your choice : ");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("Enter data to be added in list at first position : ");
				listSL.addFirst(sc.next());

				break;
				
			case 2:

				System.out.println("Enter data to be added in list at last positon : ");
				listSL.addLast(sc.next());

				break;
			case 3:
				System.out.println("Enter  the position and data to be added in list ");
				listSL.addAtPos(sc.nextInt(), sc.next());

				break;
			case 4:
				listSL.delFirst();

				break;

			case 5:
				
				listSL.deletLast();
				
				break;
				
			case 6:
				System.out.println("Enter the positon of element to be deleted");
				try {
				listSL.deleteAtPosition(sc.nextInt());
				}catch(Exception e)
				{
					System.out.println(e.getMessage());
				}

				break;
			case 7:
				listSL.deleteAll();

				break;
			case 8:
				listSL.displayList();

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
