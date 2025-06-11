package my_dsa4;

import my_dsa4.dList_Insert.Node;

public class dll_postAssignment {
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

	    public dll_postAssignment() {
	        head = null;
	        tail = null;
	    }

	    public void insertData(int num) {
	        Node newNode = new Node(num);
	        if (head == null)
	        {
	            head = newNode;
	            tail = newNode;
	        } 
	        else
	        {
	            newNode.next = head;
	            head.prev = newNode;
	            head = newNode;
	        }
	    }
	    
	    //INSERT
	    public void insertAtPosition(int num, int position)
	    {
	        Node newNode = new Node(num);
	        if (position <= 0 || head == null)
	        {
	            // Insert at the front if position is 0 or list is empty
	            if (head == null) {
	                head = newNode;
	                tail = newNode;
	            } else
	            {
	                newNode.next = head;
	                head.prev = newNode;
	                head = newNode;
	            }
	            return;
	        }
	        Node current = head;
	        int index = 0;
	        // Traverse to the node after which we want to insert
	        while (current.next != null && index < position - 1)
	        {
	            current = current.next;
	            index++;
	        }
	        // Insert at the end if position is beyond current list length
	        if (current.next == null && index < position - 1)
	        {
	            current.next = newNode;
	            newNode.prev = current;
	            tail = newNode;
	        } 
	        else
	        {
	            // Insert in the middle
	            newNode.next = current.next;
	            if (current.next != null) {
	                current.next.prev = newNode;
	            }
	            current.next = newNode;
	            newNode.prev = current;            
	            // If inserted at the end, update tail
	            if (newNode.next == null) {
	                tail = newNode;
	            }
	        }
	    }
	    //DELETE
	    public void deleteAtPosition(int position)
	    {
	        if (head == null || position < 0)
	        {
	            // List empty or invalid position
	            System.out.println("Invalid position or empty list.");
	            return;
	        }

	        if (position == 0)
	        {
	            // Delete the head node
	            if (head == tail)
	            {
	                // Only one node in list
	                head = null;
	                tail = null;
	            } 
	            else
	            {
	                head = head.next;
	                head.prev = null;
	            }
	            return;
	        }

	        Node current = head;
	        int index = 0;
	        // Traverse to the node to delete
	        while (current != null && index < position)
	        {
	            current = current.next;
	            index++;
	        }

	        if (current == null) 
	        {
	            // Position out of bounds
	            System.out.println("Position out of bounds.");
	            return;
	        }
	        // Remove current node
	        if (current.next != null)
	        {
	            current.next.prev = current.prev;
	        } 
	        else
	        {
	            // Deleting the tail
	            tail = current.prev;
	        }
	        if (current.prev != null)
	        {
	            current.prev.next = current.next;
	        }
	    }
	    //REVERSE
	    public void reverseList()
	    {
	        Node current = head;
	        Node temp = null;
	        while (current != null)
	        {
	            temp = current.prev;
	            current.prev = current.next;
	            current.next = temp;
	            current = current.prev;
	        }
	        temp = head;
	        head = tail;
	        tail = temp;
	    }
	    public void displayForward()
	    {
	        System.out.print("Forward: ");
	        Node temp = head;
	        while (temp != null)
	        {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }

	    public void displayBackward()
	    {
	        System.out.print("Backward: ");
	        Node temp = tail;
	        while (temp != null)
	        {
	            System.out.print(temp.data + " ");
	            temp = temp.prev;
	        }
	        System.out.println();
	    }

}
