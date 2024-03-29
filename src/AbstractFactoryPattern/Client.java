package AbstractFactoryPattern;

public class Client {

	public static void main(String args[]) {
		//I want to get Android Developer
		
		Employee employee = EmployeeFactory.getEmployee(new AndroidDevFactory());
		System.out.println(employee.name());
		System.out.println(employee.salary());
	}
}
