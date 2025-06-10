package my_dsa3;
public class Singly_Linked_List {
	
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
	    public Singly_Linked_List()
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
	    public void display()
	    {
	        Node temp=head;
	        while (temp!=null)
	        {
	            System.out.print(temp.data+" ");
	            temp=temp.next;
	        }
	       // System.out.println(temp.data);
	    }
	   
	}
