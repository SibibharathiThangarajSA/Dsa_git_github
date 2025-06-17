package my_dsa5;

import java.util.Scanner;

public class menuDriven {

	    Node head;
	    Node tail;

	    class Node {
	        int data;
	        Node next;
	        Node prev;

	        Node(int num) {
	            data = num;
	            next = null;
	            prev = null;
	        }
	    }

	    public menuDriven() {
	        head = null;
	        tail = null;
	    }

	    public void insertData(int num) {
	        Node newNode = new Node(num);
	        if (head == null) {
	            head = newNode;
	            tail = newNode;
	            head.next = head;
	            head.prev = head;
	        } else {
	            newNode.next = head;
	            newNode.prev = tail;
	            tail.next = newNode;
	            head.prev = newNode;
	            head = newNode;
	        }
	    }

	    public void insertAtHead(int num) {
	        Node newNode = new Node(num);
	        if (tail == null) {
	            tail = newNode;
	            tail.next = tail;
	            tail.prev = tail;
	        } else {
	            Node head = tail.next;
	            newNode.next = head;
	            newNode.prev = tail;
	            tail.next = newNode;
	            head.prev = newNode;
	        }
	    }

	    public void insertAtTail(int num) {
	        Node newNode = new Node(num);
	        if (tail == null) {
	            tail = newNode;
	            tail.next = tail;
	            tail.prev = tail;
	        } else {
	            Node head = tail.next;
	            newNode.next = head;
	            newNode.prev = tail;
	            tail.next = newNode;
	            head.prev = newNode;
	            tail = newNode;
	        }
	    }

	    public void deleteAtPosition(int pos) {
	        if (tail == null) {
	            System.out.println("List is empty");
	            return;
	        }

	        int count = 1;
	        Node temp = tail.next;
	        while (temp != tail) {
	            count++;
	            temp = temp.next;
	        }

	        if (pos <= 1 || pos >= count) {
	            System.out.println("Deletion at this position is not allowed (head/tail)");
	            return;
	        }

	        Node current = tail.next;
	        for (int i = 1; i < pos; i++) {
	            current = current.next;
	        }

	        Node prevNode = current.prev;
	        Node nextNode = current.next;

	        prevNode.next = nextNode;
	        nextNode.prev = prevNode;
	    }

	    public void deleteFromHead() {
	        if (tail == null) {
	            System.out.println("List is empty");
	            return;
	        }

	        Node head = tail.next;
	        if (head == tail) {
	            head = null;
	            tail = null;
	        } else {
	            Node newHead = head.next;
	            tail.next = newHead;
	            newHead.prev = tail;
	        }
	    }

	    public void display() {
	        if (tail == null) {
	            System.out.println("List is empty");
	            return;
	        }
	        Node head = tail.next;
	        Node temp = head;
	        do {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        } while (temp != head);
	        System.out.println();
	    }
	    
	    public static void main(String[] args) {
	    	menuDriven list =  new menuDriven();
	        Scanner sc = new Scanner(System.in);
	        int choice, num, pos;

	        do {
	            System.out.println("\n--- Circular Doubly Linked List Menu ---");
	            System.out.println("1. Insert at Head");
	            System.out.println("2. Insert at Tail");
	            System.out.println("3. Delete from Head");
	            System.out.println("4. Delete at Position (excluding head/tail)");
	            System.out.println("5. Display");
	            System.out.println("0. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter number to insert at head: ");
	                    num = sc.nextInt();
	                    list.insertAtHead(num);
	                    break;

	                case 2:
	                    System.out.print("Enter number to insert at tail: ");
	                    num = sc.nextInt();
	                    list.insertAtTail(num);
	                    break;

	                case 3:
	                    list.deleteFromHead();
	                    break;

	                case 4:
	                    System.out.print("Enter position to delete (excluding head/tail): ");
	                    pos = sc.nextInt();
	                    list.deleteAtPosition(pos);
	                    break;

	                case 5:
	                    list.display();
	                    break;

	                case 0:
	                    System.out.println("Exiting...");
	                    break;

	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }
	        } while (choice != 0);

	        sc.close();
	    }
	}

