package ReflectionAPI;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {

		// Learning-1

//		Cat myCat = new Cat("Stella", 6);
//
//		Class<? extends Cat> class1 = myCat.getClass(); // First step
//		Field[] declaredFields = class1.getDeclaredFields(); // getting all varibales/fields
//
//		for (Field field : declaredFields) {
//			System.out.println(field.getName());
//			
//
//		}
// **************************************************************************************************************

		// Learning -2
		Cat myCat = new Cat("Stella", 6);

		Class<? extends Cat> class1 = myCat.getClass(); // First step
		Field[] declaredFields = class1.getDeclaredFields(); // getting all varibales/fields

		for (Field field : declaredFields) {
			if (field.getName().equalsIgnoreCase("catName")) {
				try {
					field.setAccessible(true);
					field.set(myCat, "KT");
					// myCat -> object where you want to set the value, "KT" the value
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		Method[] declaredMethods = myCat.getClass().getDeclaredMethods();

		for (Method methods : declaredMethods) {
			if (methods.getName().equals("meow")) {
				try {
					methods.invoke(myCat);
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // In which obj you want those changes, param to method
			}

			// you have loop in methods since they don't come in order
			if (methods.getName().equals("heyThisIsPrivate")) {
				methods.setAccessible(true);
				try {
					methods.invoke(myCat);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
			
			if (methods.getName().equals("thisIsAPublicStaticMethod")) {
				methods.setAccessible(true);
				try {
					methods.invoke(null);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
			
			if (methods.getName().equals("thisIsAPrivateStaticMethod")) {
				methods.setAccessible(true);
				try {
					methods.invoke(null);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}

		}

		System.out.println(myCat);

// ***************************************************************************************************************

	}

}
