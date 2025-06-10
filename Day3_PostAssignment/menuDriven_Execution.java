package my_dsa3;

import java.util.Scanner;

public class menuDriven_Execution {
	 public static void main(String[] args)
	 {
		 singlyLinkedList_MenuDriven list = new singlyLinkedList_MenuDriven();
	        Scanner sc = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\n--- MENU ---");
	            System.out.println("1. Insert at beginning");
	            System.out.println("2. Insert at any position");
	            System.out.println("3. Delete at any position");
	            System.out.println("4. Reverse the list");
	            System.out.println("5. Display list");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            int num, pos;

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter number to insert at beginning: ");
	                    num = sc.nextInt();
	                    list.insertData(num);
	                    break;

	                case 2:
	                    System.out.print("Enter number to insert: ");
	                    num = sc.nextInt();
	                    System.out.print("Enter position: ");
	                    pos = sc.nextInt();
	                    list.insertAtPosition(num, pos);
	                    break;

	                case 3:
	                    System.out.print("Enter position to delete: ");
	                    pos = sc.nextInt();
	                    list.deleteAtPosition(pos);
	                    break;

	                case 4:
	                    list.reverse();
	                    System.out.println("List reversed.");
	                    break;

	                case 5:
	                    list.display();
	                    break;

	                case 6:
	                    System.out.println("Exiting...");
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }

	        } while (choice != 6);

	        sc.close();
	    }

}
