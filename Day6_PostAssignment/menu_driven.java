package my_dsa6;

import java.util.Scanner;

public class menu_driven {
	
	int myStack[];
	int top=-1;
	public menu_driven(int size)
	{
		myStack=new int[size];
	}
	
	//push
	public void push(int num)
	{
		if(top==4)
		{
			System.out.println("Stack overflow");
		}
		else
		{
			myStack[++top]=num;
		}
		
	}
	//pop
	public void pop()
	{
		if(top<0)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println(myStack[top]);
			myStack[top]=0;
			top--;
		}			
	}
	//display
	public void display()
	{
		for(int i=0;i< myStack.length;i++)
		{
			if(myStack[i]==0)
			{
				continue;
			}
			System.out.print(myStack[i]+" ");
		}
	}
}
