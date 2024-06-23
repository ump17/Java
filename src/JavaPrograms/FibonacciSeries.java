package JavaPrograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		//0,1,1,2,3,5,8,13....

		System.out.println("How many fibonacci number you want: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int num1 = 0;
		int num2 = 1;
		System.out.print(num1+" ");
		System.out.print(num2+" ");
		
		for(int i=1; i<=num-2;i++) {
			int num3 = num1+num2;
			System.out.print(num3+" ");
			num1 = num2;
			num2 = num3;
		}

		
	}

}
