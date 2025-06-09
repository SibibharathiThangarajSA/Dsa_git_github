package my_dsa;
import java.util.Scanner;
import java.util.Arrays;

public class menuDriven_mainPrg {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] arr = {10, 20, 30, 40, 50};
	        int choice;
	        do {
	            System.out.println("\nMenu:");
	            System.out.println("1. Insert");
	            System.out.println("2. Delete");
	            System.out.println("3. Update");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1: // Insert
	                    System.out.println("Current Array: " + Arrays.toString(arr));
	                    System.out.print("Enter element to insert: ");
	                    int element = scanner.nextInt();
	                    System.out.print("Enter index to insert (0 to " + (arr.length - 1) + "): ");
	                    int insertIndex = scanner.nextInt();
	                    if (insertIndex >= 0 && insertIndex < arr.length) {
	                        arr = insertElement(arr, element, insertIndex);
	                        System.out.println("Array after insertion: " + Arrays.toString(arr));
	                    } else {
	                        System.out.println("Invalid index. Insertion not allowed at the end.");
	                    }
	                    break;

	                case 2: // Delete
	                	System.out.println("Current Array: " + Arrays.toString(arr));
	                    System.out.print("Enter element to delete: ");
	                    int elementToDelete = scanner.nextInt();
	                    int oldLength = arr.length;
	                    arr = deleteElement(arr, elementToDelete);
	                    if (arr.length < oldLength) {
	                        System.out.println("Array after deletion: " + Arrays.toString(arr));
	                    } else {
	                        System.out.println("Element not found. No deletion occurred.");
	                    }
	                    break;

	                case 3: // Update
	                    System.out.println("Current Array: " + Arrays.toString(arr));
	                    System.out.print("Enter index to update (0 to " + (arr.length - 1) + "): ");
	                    int updateIndex = scanner.nextInt();
	                    if (updateIndex >= 0 && updateIndex < arr.length)
	                    {
	                        System.out.print("Enter new value: ");
	                        int newValue = scanner.nextInt();
	                        arr[updateIndex] = newValue;
	                        System.out.println("Array after update: " + Arrays.toString(arr));
	                    } else {
	                        System.out.println("Invalid index. Update not allowed at the end.");
	                    }
	                    break;

	                case 4: // Exit
	                    System.out.println("Exiting program...");
	                    break;

	                default:
	                    System.out.println("Invalid choice.");
	            }
	        } while (choice != 4);

	        scanner.close();
	    }

	    // Insert element
	    public static int[] insertElement(int[] array, int element, int index) {
	        int[] newArray = new int[array.length + 1];
	        for (int i = 0; i < index; i++) {
	            newArray[i] = array[i];
	        }
	        newArray[index] = element;
	        for (int i = index; i < array.length; i++) {
	            newArray[i + 1] = array[i];
	        }
	        return newArray;
	    }

	    // Delete element 
	    public static int[] deleteElement(int[] arr, int element) {
	        int index = -1;
	        // Finding index
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == element) {
	                index = i;
	                break;
	            }
	        }
	        // If not,return original array
	        if (index == -1) {
	            return arr;
	        }
	        // Create new array one size smaller
	        int[] newArr = new int[arr.length - 1];
	        // Copy all elements before the index
	        for (int i = 0; i < index; i++) {
	            newArr[i] = arr[i];
	        }
	        // Copy all elements after the index, shifted left by one
	        for (int i = index + 1; i < arr.length; i++) {
	            newArr[i - 1] = arr[i];
	        }
	        return newArr;
	    }
	}

