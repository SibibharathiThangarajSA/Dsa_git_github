package my_dsa5;

public class cll_insert
{
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

    public cll_insert()
    {
        tail = null;
    }
    public void insertAtHead(int num)
    {
        Node newNode = new Node(num);
        if (tail == null)
        {
            tail = newNode;
            tail.next = tail;
            tail.prev = tail;
        } 
        else
        {
            Node head = tail.next;
            newNode.next = head;
            newNode.prev = tail;
            tail.next = newNode;
            head.prev = newNode;
        }
    }
    public void insertAtTail(int num)
    {
        Node newNode = new Node(num);
        if (tail == null)
        {
            tail = newNode;
            tail.next = tail;
            tail.prev = tail;
        } 
        else
        {
            Node head = tail.next;
            newNode.next = head;
            newNode.prev = tail;
            tail.next = newNode;
            head.prev = newNode;
            tail = newNode; // update tail
        }
    }

    public void display()
    {
        Node temp = tail.next;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != tail.next);
        System.out.println();
    }
}
