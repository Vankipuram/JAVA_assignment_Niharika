import java.util.Set;
import java.util.HashSet;

class Employee{
	 int id;
	 String name;
	 int salary;
	 String dept;
	 Employee(String name,int salary, String dept){
		 this.name=name;
		 this.salary=salary;
		 this.dept=dept;
	 }
	 
	 
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public int getSalary() {
		return salary;
	}


	public String getDept() {
		return dept;
	}


/*	public boolean equals(Employee e) {
		return name.equals(e.name);
	}
	public int displayDetails() {
		return id;
	}*/
	public  String toString() {
		return "Employee[Name=" + name+",salary=" +salary+",Dept="+dept+"]";
	}
	public int HashCode() {
		return id;
	}
}


public class Assignment5_1 {
	public static void main(String[] args) {
		Employee e1=new Employee("Abc",30000,"CBI");
		Employee e2=new Employee("Cbc",31000,"BBc");
		Employee e3=new Employee("EFg",300000,"NAVy");
		
		Set<Employee> sEmp =new HashSet<Employee>();
		sEmp.add(e1);
		sEmp.add(e2);
		sEmp.add(e3);
		for(Employee e:sEmp)
			System.out.println(e);
	}

}
