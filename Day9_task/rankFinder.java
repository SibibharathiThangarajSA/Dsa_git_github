package my_dsa9;

public class rankFinder {
	 public static int findRank(int[] arr, int target) {
	        int left = 0;
	        int right = arr.length;
	        while (left < right) {
	            int mid = (left + right) / 2;
	            if (arr[mid] <= target) {
	                left = mid + 1;
	            } else {
	                right = mid;
	            }
	        }
	        return left;
	    }

	    public static void main(String[] args) {
	        int[] arr = {2, 3, 6, 6, 6, 8, 34, 56, 78, 89}; // sorted array
	        int target = 6;

	        int rank = findRank(arr, target);
	        System.out.println("Rank of " + target + ": " + rank);
	    }

}
