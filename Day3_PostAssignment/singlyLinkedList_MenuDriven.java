package my_dsa3;

public class singlyLinkedList_MenuDriven {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int num) {
            data = num;
        }
    }

    public singlyLinkedList_MenuDriven() {
        head = null;
    }

    public void insertData(int num) {
        Node newNode = new Node(num);
        if (head == null) {
            head = newNode;
            newNode.next = null;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAtPosition(int num, int position) {
        Node newNode = new Node(num);
        if (position < 1) {
            System.out.println("Invalid position. Position should be >= 1.");
            return;
        }

        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        int count = 1;

        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Position is greater than the length of the list.");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        if (position < 1) {
            System.out.println("Invalid position. Position should be >= 1.");
            return;
        }

        if (position == 1) {
            head = head.next;
            return;
        }

        Node current = head;
        int count = 1;

        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }

        if (current == null || current.next == null) {
            System.out.println("Position is greater than the length of the list.");
            return;
        }

        current.next = current.next.next;
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void display() {
        Node temp = head;
        if (temp == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}
