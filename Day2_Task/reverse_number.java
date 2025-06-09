package my_dsa2;

public class reverse_number {
    public static void main(String[] args) {
        int[] A = {4, 2, 10, 7, 5, 3, 8};
        int[] B = new int[A.length];  
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }
        for (int i = 0; i < B.length - 1; i++) {
            int left = 0;
            int right = 1;
            while (right < B.length - i) {
                if (B[left] < B[right]) {
                    int temp = B[left];
                    B[left] = B[right];
                    B[right] = temp;
                }
                left++;
                right++;
            }
        }
        System.out.print("A = [");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]);
            if (i < A.length - 1) System.out.print(", ");
        }
        System.out.println("]");
        System.out.print("B = [");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i]);
            if (i < B.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}

