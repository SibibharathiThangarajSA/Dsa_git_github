package my_dsa2;
import java.util.Arrays;

public class array_add_sort_descendingOrder_save
{
    public static void main(String[] args)
    {
        int[] A = {77, 27, 45, 12, 18};
        int[] B = Arrays.copyOf(A, A.length);
        System.out.print("A = ");
        for (int i = 0; i < A.length; i++)
        {
            System.out.print(A[i]);
            if (i < A.length - 1)
            {
                System.out.print(", ");
            }
        }
        System.out.println("");
        System.out.print("B = ");
        for (int i = 0; i < B.length; i++)
        {
            System.out.print(B[i]);
            if (i < B.length - 1)
            {
                System.out.print(", ");
            }
        }
        System.out.println("");
        Arrays.sort(B);
        reverseArray(B);
        System.out.print("B (Descending Order) = ");
        for (int i = 0; i < B.length; i++)
        {
            System.out.print(B[i]);
            if (i < B.length - 1)
            {
                System.out.print(", ");
            }
        }
        System.out.println("");
    }
    public static void reverseArray(int[] arr)
    {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
