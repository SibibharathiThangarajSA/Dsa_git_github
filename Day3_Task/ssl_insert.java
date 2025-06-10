package my_dsa3;
public class ssl_insert{	
	    Node head;
	    class Node
	    {
	        int data;
	        Node next;
	        Node(int num)
	        {
	            data=num;
	            next=null;
	        } 
	    } 
	    public ssl_insert()
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
	    public void insertAtPosition(int num, int position)
	    {
	        Node newNode = new Node(num);
	        if (position < 1) {
	            System.out.println("Invalid position. Position should be >= 1.");
	            return;
	        }
	        if (position == 1)
	        {
	            // Insert at the beginning
	            newNode.next = head;
	            head = newNode;	     
	        }
	        Node current = head;
	        int count = 1;	        
	        // Traverse till the node just before the position
	        while (current != null && count < position - 1)
	        {
	            current = current.next;
	            count++;
	        }        
	        if (current == null)
	        {
	            System.out.println("Position is greater than the length of the list.");
	        }	        
	        // Insert newNode after current node
	        newNode.next = current.next;
	        current.next = newNode;
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
