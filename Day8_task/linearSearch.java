package my_dsa8;

import java.util.Arrays;
import java.util.Scanner;

public class linearSearch {
	 Scanner sc=new Scanner(System.in);
	 int size;
		int arr[]=new int[30];
	public  void linear()
	{
		System.out.println("Enter the size of an array:");
		size=sc.nextInt();
		System.out.println("Enter the values of an array:");
		for(int i=0;i<size;i++)
		{
			 arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be find :");
		int fval=sc.nextInt();
		//int j=0;
		boolean flag=false;
		for(int i=0;i<size;i++)
		{
			if(fval==arr[i])
			{
				System.out.println("Element found at index "+i);
				//j++;
				flag=true;
				break;
				
			}	
			
		}
		//if(j==0)
		if(flag==false)
		{
			
			System.out.println("Element not found");
		}
		
		
	}

	public static void main(String[]args)
	{
		linearSearch ls=new linearSearch();
		Scanner sc=new Scanner(System.in);
				ls.linear();
		
	}
}
