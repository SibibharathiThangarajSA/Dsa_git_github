package my_dsa9;


public class lowerBound
{
	public static void main(String[] args)
	{
		int arr[]= {2,3,5,10,15,45,67};
		int target=6;
		int left=0;
		int right=arr.length;
		int mid;
	/*	for(int i=0;i<arr.length;i++)
		{
			if(target==arr[i])
			{
				System.out.println("The targeted element is at index:"+i);
				return;
			}
			else if(target<arr[i])
			{
				System.out.println("The targeted element is at index:"+i);
				return;
			}
		}		
		if(target>arr[arr.length-1])
		{
			System.out.println("out of bound");
		}        */
		while(left<right)
		{
			mid=(left+right)/2;
			if(target>arr[mid])
			{
				left=mid+1;
			}
			else if(target<=arr[mid])
			{
				right=mid;
			}
		}
		try
		{
			if(arr[left]>=target)
			{
				System.out.println("Lower bound index is "+left);
				
			}
			else if(target>arr[left])
			{
				System.out.println("out of bound");
			}
		}	
		catch(Exception e)
		{
			System.out.println("Out of bound exception");
		}
		
	}
}
