package BreakSingletonPattern;

import javax.management.RuntimeErrorException;

public class Samosa {

	private static Samosa samosa;

	private Samosa() {
		System.out.println("called constructor.");
//		if(samosa!=null)
//			throw new RuntimeErrorException(null, "You're trying to break singleton patter");
	}

	// Lazy way of creating object
	public static Samosa getSamosa() {

		if (samosa == null) {
			synchronized (Samosa.class) {
				if (samosa == null) {
					samosa = new Samosa();
				}
			}
		}

		return samosa;
		
		/* Used synchronized block for thread safety
		 * All synchronized blocks synchronize on the same
		 * object and can only have one thread executed inside them at a time.
		 *  */

	}

}
