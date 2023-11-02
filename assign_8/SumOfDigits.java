package assign_8;

import java.util.Scanner;

public class SumOfDigits {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();

        int sum = sumOfDigits(number);
        System.out.println("The sum of the digits is: " + sum);
    }

    public static int sumOfDigits(int num) {
      
        if (num < 10) 
            return num;

        int lastDigit = num % 10;
        int remainingDigits = num / 10;
        return lastDigit + sumOfDigits(remainingDigits);
    }
}
