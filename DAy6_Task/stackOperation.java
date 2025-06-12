package my_dsa6;

public class stackOperation {
		int myStack[]=new int[5];
		int top=-1;
		public  void push(int num)
		{
			if(top>=4)
			{
				System.out.print("Stack overflow");
			}
			else
			{
			myStack[++top]=num;
			}
		}
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
		public void display()
		{
			for(int i=0;i<myStack.length;i++)
			{
				/*if(myStack[i]==0)
				{
					continue;
				}*/
				System.out.print(myStack[i]+" ");
			}
		}
	
}
