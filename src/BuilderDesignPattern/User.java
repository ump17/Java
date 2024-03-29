package BuilderDesignPattern;

public class User {

	private final String userID;
	private final String userName;
	private final String emailID;

	private User(UserBuilder builder) {
		// initialize
		this.userID = builder.userID;
	    this.emailID = builder.emailID;
	    this.userName = builder.userName;
	}
	
	

	@Override
	public String toString() {
		return "User [userID=" + userID + ", userName=" + userName + ", emailID=" + emailID + "]";
	}



	public String getUserID() {
		return userID;
	}

	public String getUserName() {
		return userName;
	}

	public String getEmailID() {
		return emailID;
	}
	
	//inner class
	static class UserBuilder {
		
		private  String userID;
		private  String userName;
		private  String emailID;
		
		public UserBuilder() {
			
		}
		
		public UserBuilder setUserID(String userID) {
			this.userID = userID;
			return this;
		}

		public UserBuilder setUserName(String userName) {
			this.userName = userName;
			return this;
		}

		public UserBuilder setEmailID(String emailID) {
			this.emailID = emailID;
			return this;
		}
		
		public User build(){
			 User user = new User(this);
			 return user;
		}
		
	}
	

}
