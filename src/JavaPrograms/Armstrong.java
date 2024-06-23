package JavaPrograms;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: "); // 153
		int remainder, sum = 0, temp;
		int n = sc.nextInt();
		temp = n;
		
		while (n > 0) {         // to iterate 3 time, no need to find num of digit.
			remainder = n % 10; // getting remainder ->3
			sum = sum + (remainder*remainder*remainder); //9
			n = n / 10;         // --> 35
		}
		if (temp == sum)
			System.out.println("Armstrong number ");
		else
			System.out.println("not Armstrong number");
	}
}
