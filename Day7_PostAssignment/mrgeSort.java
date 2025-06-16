package my_dsa7;

import java.util.Arrays;

public class mrgeSort {
	 public static void mergeSort(int[] sample, int left, int right) {
	        if (left < right) {
	            int mid = (left + right) / 2;

	            mergeSort(sample, left, mid);
	            mergeSort(sample, mid + 1, right);
	            merge(sample, left, mid, right);
	        }
	    }

	    public static void merge(int[] sample, int left, int mid, int right) {
	        int n1 = mid - left + 1;
	        int n2 = right - mid;
	        
	        int[] L = new int[n1];
	        int[] R = new int[n2];

	        for (int i = 0; i < n1; i++)
	            L[i] = sample[left + i];
	        for (int j = 0; j < n2; j++)
	            R[j] = sample[mid + 1 + j];

	        int i = 0, j = 0;
	        int k = left;

	        while (i < n1 && j < n2) {
	            if (L[i] <= R[j]) {
	                sample[k] = L[i];
	                i++;
	            } else {
	                sample[k] = R[j];
	                j++;
	            }
	            k++;
	        }
	        while (i < n1) {
	            sample[k] = L[i];
	            i++;
	            k++;
	        }
	        while (j < n2) {
	            sample[k] = R[j];
	            j++;
	            k++;
	        }
	    }

	    public static void mergeSort(int[] sample) {
	        System.out.println("Before Sorting: " + Arrays.toString(sample));
	        mergeSort(sample, 0, sample.length - 1);
	        System.out.println("After Sorting: " + Arrays.toString(sample));
	    }

	    public static void main(String[] args) {
	        int[] arr = {33, 53, 11, 43, 23};
	        mergeSort(arr);
	    }

}
