package IteratorPattern;

public class Main {

	public static void main(String[] args) {
		
		UserManagement userManagement = new UserManagement();
		userManagement.addUser(new User("Ashish", "17"));
		userManagement.addUser(new User("Kailash", "14"));
		userManagement.addUser(new User("Akshay", "7"));
		
		
		MyIterator iterator = userManagement.getIterator();
		
		while(iterator.hasNext()) {
			User user = (User) iterator.next();
			System.out.println(user.getName());
		}
		
	}
}
