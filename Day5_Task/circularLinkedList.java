package my_dsa5;

public class circularLinkedList {
	
	    Node head;
	    Node tail;

	    class Node
	    {
	        int data;
	        Node next;
	        Node prev;

	        Node(int num)
	        {
	            data = num;
	            next = null;
	            prev = null;
	        }
	    }

	    public circularLinkedList()
	    {
	        head = null;
	        tail = null;
	    }

	    public void insertData(int num)
	    {
	        Node newNode = new Node(num);
	        if (head == null)
	        {
	            head = newNode;
	            tail = newNode;
	            head.next = head;
	            head.prev = head;
	        } 
	        else
	        {
	            newNode.next = head;
	            newNode.prev = tail;
	            tail.next = newNode;
	            head.prev = newNode;
	            head = newNode;
	        }
	    }

	    public void display()
	    {
	        if (head == null) {
	            System.out.println("List is empty");
	            return;
	        }
	        Node temp = head;
	        do 
	        {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }while (temp != head);
	        System.out.println();
	    }	   
	}