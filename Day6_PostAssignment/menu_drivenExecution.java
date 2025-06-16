package my_dsa6;

import java.util.Scanner;

public class menu_drivenExecution {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the stack:");
		int sizeS=sc.nextInt();
		menu_driven md=new menu_driven(sizeS);
		int op;
		do
		{
		System.out.println("\n1:Push");
		System.out.println("2:Pop");
		System.out.println("3:Display");
		System.out.println("4:Exit");
		System.out.println("Choose the option:");
		op=sc.nextInt();
		switch(op)
		{
		case 1://push
			System.out.println("Enter the values to be pushed:");
			int pushVal=sc.nextInt();
			md.push(pushVal);
			break;
		case 2: //pop
			
			md.pop();
			break;
			
		case 3: //display
			md.display();
			break;
		case 4:
			System.out.println("Exit");
			break;
		default:
			System.out.println("invalid option");
			break;
		}
		}while(op!=4);
		sc.close();
	}
	

}
