package my_dsa3;


public class ssl_reverse {
	Node head;
    class Node
    {
        int data;
        Node next;
        Node(int num)  //constructor
        {
            data=num;
        } 
    } 
    public ssl_reverse()
    {
        head=null;
        //next=null;
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
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        
        while (current != null) {
            next = current.next;  // Store next node
            current.next = prev;  // Reverse current node's pointer
            prev = current;       // Move prev to current
            current = next;       // Move to next node
        }
        head = prev; // Update head to new first node
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
