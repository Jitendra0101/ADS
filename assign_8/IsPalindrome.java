package assign_8;

import java.util.Scanner;

public class IsPalindrome {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");

		if (isPalindrome(sc.nextInt()))
			System.out.println(" It IS a Palindrome.");
		else
			System.out.println(" It is NOT a Palindrome.");

		sc.close();
	}

	public static boolean isPalindrome(int num) {

		if (num < 0)
			return false;

		int originalNumber = num;
		int reversedNumber = 0;

		while (num > 0) {
			int digit = num % 10;
			reversedNumber = reversedNumber * 10 + digit;
			num = num / 10;
		}

		return originalNumber == reversedNumber;
	}
}
