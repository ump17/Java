package ShallowDeepCopy;

public class Student implements Cloneable {

	public int rollNo;
	Address address;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student student = (Student) super.clone();
		student.address = (Address) address.clone(); //obj ref wale field k liye alag se clone, IMP STEP
		return student;
	}
}
