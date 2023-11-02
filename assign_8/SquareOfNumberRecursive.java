package assign_8;

import java.util.Scanner;

public class SquareOfNumberRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();

        int square = squareRecursive(number);
        System.out.println("The square of the number is: " + square);
    }

    public static int squareRecursive(int num) {
    
        if (num == 0 || num == 1)
            return num;

        return num * num;
    }
}
