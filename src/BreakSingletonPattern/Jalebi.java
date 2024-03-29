package BreakSingletonPattern;

public class Jalebi {
	
	//eager way of creating single object
	private static Jalebi jalebi = new Jalebi();
	
	public static Jalebi getJalebi() {
		return jalebi;
	}
	
	
	
	
	/* Disadvantage 
	 * what if i don't use this object, unnecessarily object created when class loaded*/
	

}
