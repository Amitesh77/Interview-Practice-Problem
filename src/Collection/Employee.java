package Collection;

import java.util.ArrayList;

public class Employee {
	
	String name;
	int id;
	int salary;
	
	
	

	public Employee(String name, int id, int salary) {
		
		this.name = name;
		this.id = id;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> list=new ArrayList<Employee>();
		
		populate(list);

	}
	
	
	
	public static void populate(ArrayList<Employee> list)
	{
		list.add(new Employee("Amitesh",23,12000));
		list.add(new Employee("Ravi",26,55000));
		list.add(new Employee("Piu",24,54000));
		list.add(new Employee("Abhi",73,14560));
		list.add(new Employee("Rohit",234,54300));
		list.add(new Employee("Anand",55,56000));
	}

}
