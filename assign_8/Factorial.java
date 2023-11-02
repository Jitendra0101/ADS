package assign_8;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = sc.nextInt();
        sc.close();

        long result = factorial(number);
        System.out.println("Factorial of " + number + " is " + result);
    }

    public static long factorial(long n) {
        return factorialTailRecursive(n, 1);
    }

    private static long factorialTailRecursive(long n, long accumulator) {
    
        if (n == 0) 
            return accumulator;

        return factorialTailRecursive(n - 1, accumulator * n);
    }
}
