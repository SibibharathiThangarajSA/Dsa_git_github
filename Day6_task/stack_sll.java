package sampleTry;

import java.util.Scanner;

public class stack_sll {
	
	node head;
	class node
	{
		node next;
		int data;
		node(int num)
		{
			data = num;
			next=null;
		}
	}
	public stack_sll()
	{
		head=null;
	}
	public void push(int num)
	{
		node newNode= new node(num);
		if(head==null)
		{
			head=newNode;
			newNode.next=null;
		}
		else
		{
			newNode.next=head;
			head=newNode;
		}
	}
	public void pop()
	{
		if(head==null)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println(head.data);
			head=head.next;
		}
	}
	public void display()
	{
		node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println("");
	}
	public static void main(String []args)
	{
		
		stack_sll ss=new stack_sll();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the stack:");
		int size=sc.nextInt();
		System.out.println("Enter the values to be inserted in the stack:");
		for(int i=0;i<size;i++)
		{
			ss.push(sc.nextInt());
		}
		ss.display();
		ss.pop();
		ss.pop();
		ss.pop();
		ss.pop();
		ss.display();
	}
}
