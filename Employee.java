package Collection;

public class Employee {
	private String name;
	private int id;
	private int age;
	private String gender;
	private long phoneNumber;
	private int salary;

	public Employee(String name, int id, int age, String gender, long phoneNumber, int salary) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.salary = salary;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String toString() {
		return "Employee="+name + " " + id + " " + age + " " + gender + " " + phoneNumber + " " + salary;
	}
}
