package Serialization;

import java.io.Serializable;

public class Employee implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -2096516584627582690L;
	private String name;
    private int age;
	transient private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters and setters
    public String getName() {
  		return name;
  	}

  	public void setName(String name) {
  		this.name = name;
  	}

  	public int getAge() {
  		return age;
  	}

  	public void setAge(int age) {
  		this.age = age;
  	}

  	public double getSalary() {
  		return salary;
  	}

  	public void setSalary(double salary) {
  		this.salary = salary;
  	}
}
