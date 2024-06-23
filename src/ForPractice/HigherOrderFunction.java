package ForPractice;

interface Dancable {
	void dance();
}

class HigherOrderFunction {
	static void testing(Dancable dance) {
		dance.dance();
	}

	public static void main(String[] args) {

		HigherOrderFunction.testing(()->{
			System.out.println("hello");
		}
		);

	}
}