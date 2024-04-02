package ReflectionAPI;

public class Cat {

	private String catName;
	private int age;

	public Cat(String catName, int age) {
		this.catName = catName;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Cat [catName=" + catName + ", age=" + age + "]";
	}

	public String getCatName() {
		return catName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void meow() {
		System.out.println("Meow Meow Meow");
	}

	private void heyThisIsPrivate() {
		System.out.println("How did you call this?");
	}

	public static void thisIsAPublicStaticMethod() {
		System.out.println(" I am public and static");
	}

	private static void thisIsAPrivateStaticMethod() {
		System.out.println("I am private and static");
	}

}
