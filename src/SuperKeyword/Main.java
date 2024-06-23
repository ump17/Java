package SuperKeyword;

public class Main {

	public static void main(String[] args) {
		
		Dog myDog = new Dog("KK",12,"bones");
		System.out.println(myDog.name);
		System.out.println(myDog.age);
		System.out.println(myDog.foodPreference);
		
		myDog.makeNoise();
	}

}
