package my_dsa2;

import java.util.Scanner;

public class removeDuplicates {
	public static int removeDupli(int[] nums)
	{
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++)
        {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " sorted integers:");
        for (int i = 0; i < n; i++)
        {
            nums[i] = scanner.nextInt();
        }
        int length = removeDupli(nums);
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < length; i++) {

            System.out.print(nums[i] + " ");

        }
        scanner.close();

    }

}
