package my_dsa;

import java.util.Scanner;

public class arrayOperation {
	public static void main(String[]args)
	{
		 Scanner scanner = new Scanner(System.in);
	        // Example array
	        int[] arr = {10, 20, 30, 40, 50};
	        int n = arr.length; // size of the array
	        System.out.println("Original Array:");
	        printArray(arr);	        
	        System.out.print("Enter the index to delete:");
	        int index = scanner.nextInt();	        
	        if (index > 0 || index <= n - 1) 
	        {
	        	 arr = deleteElement(arr, index);
		            System.out.println("Array after deletion:");
		            printArray(arr);
	        } 
	        else 
	        {
	        	System.out.println("Invalid index for deletion. You cannot delete the last element.");
	        }
	        scanner.close();
	    }
	  // Function to delete the element at a given index
	    public static int[] deleteElement(int[] arr, int index) {
	        int n = arr.length;        
	        // Create a new array of size n-1
	        int[] newArr = new int[n - 1];      
	        // Copy elements before the index
	        for (int i = 0; i < index; i++) {
	            newArr[i] = arr[i];
	        }	        
	        // Copy elements after the index
	        for (int i = index + 1; i < n; i++) {
	            newArr[i - 1] = arr[i];
	        }	        
	        return newArr;
	    }
	    // Function to print array
	    public static void printArray(int[] arr) {
	        for (int i : arr) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	    }	

}
