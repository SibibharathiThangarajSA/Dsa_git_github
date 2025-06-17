package my_dsa9;

public class countTarget {
	
	public static int lowerBound(int []arr,int target)
	{
		int left=0;
		int right=arr.length;
		int mid;
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
		return left;
		
	}
	
	public static int upperBound(int []arr,int target)
	{
		int left=0;
		int right=arr.length;
		int mid;
		while(left<right)
		{
			 mid=(left+right)/2;
			if(target>=arr[mid])
			{
				left=mid+1;
			}
			else if(target<=arr[mid])
			{
				right=mid;
			}
		}
		return left;
	}	
	public static void main(String []args)
	{
		int arr[]= {2,3,6,6,6,8,34,56,78,89};
		int target=6;
		int ub=upperBound(arr,target);
		int lb=lowerBound(arr,target);
		int count=ub-lb;
		System.out.println(count);
		
	}

}
