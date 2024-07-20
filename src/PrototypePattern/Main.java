package PrototypePattern;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		NetworkConnection conn1 = new NetworkConnection();
		conn1.setIp("192.145");
		conn1.loadVeryImpData();
	    System.out.println(conn1);
	    
//	    NetworkConnection conn2 = conn1;
//	    conn2.setIp("100.100");
//	    conn2.loadVeryImpData();
//	    System.out.println(conn2);
	    
	   try {
		   NetworkConnection conn2 = (NetworkConnection) conn1.clone();
		   conn1.getDomain().remove(0);
		   System.out.println(conn1);
		   System.out.println(conn2);
	   }catch(CloneNotSupportedException e) {
		   e.printStackTrace();
	   }
	    
	    

	}

}
