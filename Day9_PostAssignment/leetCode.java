package my_dsa9;

public class leetCode {
	
	public static int lowerBound(int[] arr, int target)
	{
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid;
            }
        }
        return left;
    }


    public static int upperBound(int[] arr, int target)
    {
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] <= target)
            {
                left = mid + 1;
            } 
            else
            {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 2, 4, 4, 4, 5, 7, 9};
        int target = 4;

        int lb = lowerBound(arr, target);
        int ub = upperBound(arr, target);

        System.out.println("Lower Bound of " + target + " is at index: " + lb);
        System.out.println("Upper Bound of " + target + " is at index: " + ub);
        System.out.println("Count of target " + target + " is: " + (ub - lb));
    }

}
