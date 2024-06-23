package ShallowDeepCopy;

public class StudentTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1 = new Student();
		s1.rollNo =1;
		
		Address adr = new Address();
		adr.addressId = 22;
		s1.address = adr;
		
//		Student s2 = s1;  // reference copy hence both pointing to same location
//		s2.rollNo = 2;
		
		Student s2 = (Student) s1.clone(); // shallow copy
		s2.rollNo = 2;
		s2.address.addressId = 90;
		
		System.out.println(s1.rollNo);
		System.out.println(s2.rollNo);
		
		System.out.println(s1.address.addressId);
		System.out.println(s2.address.addressId);

	}

}
