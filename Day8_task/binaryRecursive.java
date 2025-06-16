package my_dsa8;

import java.util.Arrays;

public class binaryRecursive {
	public int search(int a[],int find,int mid,int left,int right)
	{
		if(a[mid]==find)
			return mid;
		else if(find >a[mid])
			return search(a,find,mid+1,left,right);
		else
			return search(a,find,mid-1,left,right);
	}
	public static void main(String[]args)
	{
		binaryRecursive bsr=new binaryRecursive();
		int a[]= {23,45,6,74,67,89};
		int find=74;
		int left=0;
		int right=a.length-1;
		int mid=(left+right)/2;
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("Element found at "+bsr.search(a,find,mid,left,right));
	}

}
