package my_dsa5;

public class cll_rear_front_execution {
	public static void main(String[] args) {
		cll_front_rear queue = new cll_front_rear();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display(); 

        queue.dequeue(); 
        queue.display();

        queue.dequeue(); 
        queue.display(); 

        queue.dequeue();
        queue.display(); 
    }
}
