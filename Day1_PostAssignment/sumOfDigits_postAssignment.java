package my_dsa;
import java.util.Scanner;
public class sumOfDigits_postAssignment {
	 public static void main(String[] args)
	 {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();
	        if (num < 1)
	        {
	            System.out.println("Enter a positive number.");
	            } 
	        else
	        {
	            int result = sum(num);
	            System.out.println("Sum from 1 to " + num + " is: " + result);
	            }
	        scanner.close();
	    }
	
	 public static int sum(int n) {
	        if (n == 1) {
	            return 1;
	        }
	        return n + sum(n - 1);
	    }
	
}

