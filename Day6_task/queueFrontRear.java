package my_dsa6;

import java.util.Arrays;

public class queueFrontRear {
	
	int []arr=new int[5];
	int rear=-1;
	int front=-1;
	
	//public queueFrontRear()
	//{
		//rear=-1;
		//front=-1;
	//}
	public void enqueue(int num)
	{
		if(rear==4)
		{
			System.out.println("Queue Spreadout");
		}
		else
		{
			arr[++rear]=num;
		}
	}
	public void dequeue()
	{
		if(front==4)
		{
			System.out.println("Empty Operation");
		}
		else
		{
			arr[++front]=0;
		}
	}
	public void display()
	{
		System.out.println(Arrays.toString(arr));
	}

}
