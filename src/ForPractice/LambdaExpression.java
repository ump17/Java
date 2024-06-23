package ForPractice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LambdaExpression {

	interface MyInterface {
		void someMethod();
	}

	public static void main(String[] args) {
		Predicate<Integer> isEven = (n) -> n % 2 == 0;

		MyInterface obj = () -> System.out.println("Method invoked");
		obj.someMethod();

		System.out.println(isEven.test(4));
		System.out.println(isEven.test(7));
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		List<Integer> evenNumbers = numbers.stream().filter(isEven).collect(Collectors.toList());
		System.out.println(evenNumbers);
				
		

	}

}
