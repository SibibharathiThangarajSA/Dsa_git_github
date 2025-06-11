package my_dsa5;
public class cll_deleteAtAnyPos
{
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

    public cll_deleteAtAnyPos()
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
	public void deleteAtPosition(int pos)
	{
	    if (tail == null)
	    {
	        System.out.println("List is empty");
	        return;
	    }
	    int count = 1;
	    Node temp = tail.next; 
	    while (temp != tail)
	    {
	        count++;
	        temp = temp.next;
	    }

	    if (pos <= 1 || pos >= count)
	    {
	        System.out.println("Deletion at this position is not allowed (head/tail)");
	        return;
	    }

	    Node current = tail.next; 
	    for (int i = 1; i < pos; i++)
	    {
	        current = current.next;
	    }
	    Node prevNode = current.prev;
	    Node nextNode = current.next;

	    prevNode.next = nextNode;
	    nextNode.prev = prevNode;
	}
    public void display()
    {
        if (head == null)
        {
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
