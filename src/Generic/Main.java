package Generic;

public class Main {

	public static void main(String[] args) {
		
		Printer<Integer> printInteger = new Printer<>(12);
		printInteger.print();
		
		Printer<Double> printDouble = new Printer<>(12.12);
		printDouble.print();
	}
}
