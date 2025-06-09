package my_dsa;
public class maxMinArray {
	public static void main(String[]args)
	{
	        int[] arr = {100, 20, 30, 40, 50};
	        System.out.println("Original Array:");
	        printArray(arr);
	        maxArray(arr);
	        minArray(arr);
	}
	 public static void printArray(int[] arr)
	 {
	        for (int i : arr) 
	        {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	    }
	 public static void maxArray(int[] arr)
	 {
		 int n = arr.length;
		 for(int i=0;i<n;i++)
		 {
			 if(arr[i]<arr[n-1])
			 {
				 continue;
			 }
			 else
			 {
				System.out.println("Maximum value of an array is :"+arr[i]);
				break;
			 }
		 }
	
	 }
	 public static void minArray(int[] arr)
	 {
		 int n = arr.length;
		 for(int i=0;i<n;i++)
		 {
			 if(arr[i]>arr[n-1])
			 {
				 continue;
			 }
			 else
			 {
				System.out.println("Minimum value of an array is :"+arr[i]);
				break;
			 }
		 }
	 }
}
