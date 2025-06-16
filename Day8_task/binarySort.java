package my_dsa8;

import java.util.Arrays;
import java.util.Scanner;

public class binarySort {
	public static void main(String[] args) {
		int arr[]= {34,56,2,4,78,90,67,45,12,10};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element to find;");
		int fval=sc.nextInt();
		int left=0;
		int mid=0;
		int right=arr.length-1;
		while(left<=right)
		{
			mid=(left+right)/2;
			if(arr[mid]==fval)
			{
				System.out.println("Element found at index "+mid);
				break;
			}
			else if(fval>arr[mid])
			{
				left=mid+1;
			}
			else if(fval<arr[mid])
			{
				right=mid-1;
			}
			
		}
		
	}
}
