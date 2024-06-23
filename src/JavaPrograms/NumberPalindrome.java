package JavaPrograms;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: "); // 353
		int remainder, sum = 0, temp;
		int n = sc.nextInt();
		temp = n;
		
		while (n > 0) {         // to iterate 3 time, no need to find num of digit.
			remainder = n % 10; // getting remainder ->3
			sum = (sum * 10) + remainder;
			n = n / 10;         // --> 35
		}
		if (temp == sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");
	}
}
