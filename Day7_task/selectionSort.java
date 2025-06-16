package my_dsa7;

import java.util.Arrays;

public class selectionSort {
	 public static void selectionSort(int[] sample) {

	        System.out.println("Before Sorting: " + Arrays.toString(sample));

	        for (int i = 0; i < sample.length - 1; i++) {

	            int minIndex = i;

	            for (int j = i + 1; j < sample.length; j++) {

	                if (sample[j] < sample[minIndex]) {

	                    minIndex = j;

	                }

	            }

	            int temp = sample[i];

	            sample[i] = sample[minIndex];

	            sample[minIndex] = temp;

	        }



	        System.out.println("After Sorting: " + Arrays.toString(sample));

	    }



	    public static void main(String[] args) {

	        int[] arr = {15, 45, 35, 65, 55};

	        selectionSort(arr);

	    }

}
