package my_dsa;
import java.util.Scanner;
public class factorialFibonacci {
	public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        //Factorial
        System.out.print("Enter a number for factorial: ");
        int numFact = scanner.nextInt();
        System.out.println("Factorial of " + numFact + " is: " + factorial(numFact)); 
        
        //Fibonacci Series
        System.out.print("Enter a number for Fibonacci Series: ");
        int numFibo = scanner.nextInt();
        System.out.println("Fibonacci number at position " + numFibo+ " is: " + fibonacci(numFibo));      
        System.out.println("Fibonacci series up to " + numFibo+ "th number: ");
        for (int i = 0; i <= numFibo; i++) {
            System.out.print(fibonacci(i) + " ");
        }       
        scanner.close();
    }
	    public static int factorial(int n) {
	        if (n == 0 || n == 1) {
	            return 1;
	        } else {
	            return n * factorial(n - 1);
	        }
	    }
	    public static int fibonacci(int n) {
	        if (n == 0) {
	            return 0;
	        } else if (n == 1) {
	            return 1;
	        } else {
	            return fibonacci(n - 1) + fibonacci(n - 2);
	        }
	    }	    
	}
