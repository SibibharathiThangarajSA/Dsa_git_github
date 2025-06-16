package my_dsa6;

public class queueFrontRearExecution {
	public static void main(String[]args)
	{
		queueFrontRear q=new queueFrontRear();
		  q.enqueue(10);
		    q.enqueue(20);
		    q.enqueue(30);
		    q.enqueue(40);
		    q.enqueue(50);
		    q.enqueue(60);		
		    q.display();		  
		    q.dequeue();
		    q.dequeue();		
		    q.display();		
		    q.enqueue(60);  
		    q.dequeue();
		    q.dequeue();
		    q.dequeue();
		    q.dequeue();
		    q.display();
	}

}
