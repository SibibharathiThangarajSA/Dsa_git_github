package my_dsa4;
public class dList_Delete {
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

    public dList_Delete() {
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

