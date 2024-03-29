package BuilderDesignPattern;

public class Main {
	
	public static void main(String args[]) {
		
		User userBuild = new User.UserBuilder().setEmailID("thunder@gmail.com")
											   .setUserID("1")
											   .setUserName("Ashish")
											   .build();
		
		System.out.println(userBuild);
		
	}

}
