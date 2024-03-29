package SingletonPattern;

public class Example {
	
	public static void main(String args[]) {
		//Lazy way
		System.out.println(Samosa.getSamosa().hashCode());
		System.out.println(Samosa.getSamosa().hashCode());
		
		//Eager way
		System.out.println(Jalebi.getJalebi().hashCode());
		System.out.println(Jalebi.getJalebi().hashCode());
		
	}
	
}
