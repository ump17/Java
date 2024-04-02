package SuperKeyword;

public class Animal {

	public String name;
	public int age;
	
	public Animal() {
		
	}
	
	public Animal(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public void makeNoise() {
		System.out.println("Hello, I am animal");
	}
	
	public void eat() {
		System.out.println("Munch munch");
	}
}
