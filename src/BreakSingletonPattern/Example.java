package BreakSingletonPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Example {

	public static void main(String args[]) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// Lazy way
		System.out.println(Samosa.getSamosa().hashCode());

		// M1 - Reflection Api
		// solution-> throw runtime exception from that constructor
		Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
		constructor.setAccessible(true);		
		Samosa s2 = constructor.newInstance();
		System.out.println(s2.hashCode());
		
		//M2- Deserialization ( for this to happen, samosa class should implement serializable
		// solution-> override readResolve method
		

	}

}
