package JavaPrograms;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name: ");
		String name = sc.nextLine();
		name = name.toLowerCase();
		int j = name.length() - 1;
		
		for (int i = 0; i <= j / 2; i++) {
			if (name.charAt(i) == name.charAt(j)) {
				j -= 1;
			} else {
				System.out.println("Not a palindrome");
				return;
			}
		}
		System.out.println("is palindrome");
	}
}
