package my_dsa4;
import java.util.Scanner;
public class dll_post_execution {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        dll_postAssignment dll = new dll_postAssignment();
	        int choice;

	        do {
	            System.out.println("\n------- Doubly Linked List Menu -------");
	            System.out.println("1. Insert at beginning");
	            System.out.println("2. Insert at position");
	            System.out.println("3. Delete at position");
	            System.out.println("4. Reverse the list");
	            System.out.println("5. Display Forward");
	            System.out.println("6. Display Backward");
	            System.out.println("7. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter number to insert: ");
	                    int num1 = sc.nextInt();
	                    dll.insertData(num1);
	                    break;

	                case 2:
	                    System.out.print("Enter number to insert: ");
	                    int num2 = sc.nextInt();
	                    System.out.print("Enter position to insert at: ");
	                    int pos2 = sc.nextInt();
	                    dll.insertAtPosition(num2, pos2);
	                    break;

	                case 3:
	                    System.out.print("Enter position to delete: ");
	                    int pos3 = sc.nextInt();
	                    dll.deleteAtPosition(pos3);
	                    break;

	                case 4:
	                    dll.reverseList();
	                    System.out.println("List reversed successfully.");
	                    break;

	                case 5:
	                    dll.displayForward();
	                    break;

	                case 6:
	                    dll.displayBackward();
	                    break;

	                case 7:
	                    System.out.println("Exiting... Thank you!");
	                    break;

	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }
	        } while (choice != 7);

	        sc.close();

	 }
}
