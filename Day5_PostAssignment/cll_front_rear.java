package my_dsa5;

public class cll_front_rear {
	    Node front;
	    Node rear;

	    class Node {
	        int data;
	        Node next;
	        Node prev;

	        Node(int num) {
	            data = num;
	            next = null;
	            prev = null;
	        }
	    }

	    public cll_front_rear() {
	        front = null;
	        rear = null;
	    }

	    // Enqueue - insert at rear
	    public void enqueue(int num) {
	        Node newNode = new Node(num);
	        if (front == null) {
	            front = newNode;
	            rear = newNode;
	            front.next = front;
	            front.prev = front;
	        } else {
	            newNode.prev = rear;
	            newNode.next = front;
	            rear.next = newNode;
	            front.prev = newNode;
	            rear = newNode;
	        }
	    }

	    // Dequeue - delete from front
	    public void dequeue() {
	        if (front == null) {
	            System.out.println("Queue is empty");
	            return;
	        }

	        // Only one element
	        if (front == rear) {
	            System.out.println("Dequeued: " + front.data);
	            front = null;
	            rear = null;
	        } else {
	            System.out.println("Dequeued: " + front.data);
	            front = front.next;
	            front.prev = rear;
	            rear.next = front;
	        }
	    }

	    public void display() {
	        if (front == null) {
	            System.out.println("Queue is empty");
	            return;
	        }

	        Node temp = front;
	        do {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        } while (temp != front);
	        System.out.println();
	    }
}
