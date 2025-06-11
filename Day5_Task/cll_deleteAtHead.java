package my_dsa5;

public class cll_deleteAtHead
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

    public cll_deleteAtHead()
    {
        tail = null;
    }

    public void insertData(int num)
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

    public void deleteFromHead()
    {
        if (tail == null) 
        {
            System.out.println("List is empty");
            return;
        }

        Node head = tail.next;

        if (head == tail)
        {
            tail = null;
        } 
        else
        {
            Node newHead = head.next;
            tail.next = newHead;
            newHead.prev = tail;
        }
    }

    public void display()
    {
        if (tail == null)
        {
            System.out.println("List is empty");
            return;
        }

        Node temp = tail.next;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != tail.next);

        System.out.println();
    }
}
