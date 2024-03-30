package IteratorPattern;

import java.util.ArrayList;

import IteratorPattern.User;

public class UserManagement {
	
	private ArrayList<User> userList = new ArrayList<>();
	
	
	public void addUser(User ashish) {
		userList.add(ashish);
	}
	
	public User getUser(int index) {
		return userList.get(index);
	}
	
	public MyIterator getIterator() {
		return new MyIteratorImpl(userList);
	}

}
