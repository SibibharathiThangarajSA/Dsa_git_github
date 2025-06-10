package my_dsa4;
public class dList_Reverse {
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
    public dList_Reverse() 
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
        } 
        else
        {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
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

