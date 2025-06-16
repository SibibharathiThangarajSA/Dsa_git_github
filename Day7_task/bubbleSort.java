package my_dsa7;

import java.util.Arrays;

public class bubbleSort {
	
	public static void bubble(int []a)
	{
		System.out.println(Arrays.toString(a));
		
		for(int i=1;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}	
	
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
	}
	public static void main(String[]args)
	{
		int arr1[]= {23,3,7,44,55,2,9};
		bubbleSort bs=new bubbleSort();
		bs.bubble(arr1);
	}

}
