package my_dsa3;
public class ssl_delete {
	Node head;
    class Node
    {
        int data;
        Node next;
        Node(int num)  //constructor
        {
            data=num;
            next=null;
        } 
    } 
    public ssl_delete()
    {
        head=null;
    }
    public void insertData(int num)
    {
        Node newNode=new Node(num);
        if (head==null) 
        {
            head=newNode;
            newNode.next=null;
        }
        else
        {     
            newNode.next=head;
            head=newNode;
        }
    }   	
    public void deleteAtPosition(int position)
    {
        if (head == null)
        {
            System.out.println("List is empty. Nothing to delete.");
        }
        if (position < 1)
        {
            System.out.println("Invalid position. Position should be >= 1.");
        }
        if (position == 1)
        {
            // Delete the head node
            head = head.next;
        }
        Node current = head;
        int count = 1;
        // Traverse to the node just before the one to be deleted
        while (current != null && count < position - 1)
        {
            current = current.next;
            count++;
        }
        if (current == null || current.next == null)
        {
            System.out.println("Position is greater than the length of the list.");
        }

        // Delete the node at the position
        current.next = current.next.next;
    }

    public void display()
    {
        Node temp=head;
        while (temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

}
