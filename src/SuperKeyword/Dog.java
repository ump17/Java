package SuperKeyword;

public class Dog extends Animal{
	
	String foodPreference;
	
	
	public Dog(String name,int age,String foodPreference) {
		super(name,age);
		this.foodPreference = foodPreference;
	}
	
	@Override
	public void makeNoise() {
		
		eat();
		System.out.println(" Hi, Dog here");
		super.makeNoise();
	}
	
	
	/*
	 * If I am overriding any method then In order to call method which is overriden, use "super" keyword
	 * other than that case, calling method directly will work.
	 * 
	 *In method, super.MethodName() should necessarily be 1st line of the method. 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	

}
