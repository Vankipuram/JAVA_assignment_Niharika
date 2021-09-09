
class Employee{
	String name;
	int salary;
	Employee(){
		name=null;
		salary=0;
	}
	Employee(String name, int salary){
		this.name=name;
		this.salary=salary;
	}
	int getSalary() {
		return salary;
	}
		
}
class Manager extends Employee{
	int salary1;
	Manager(){
		super();
		salary1=0;
	}
	Manager(String n, int salary){
		super(n,salary);
		}
	int getSalary() {
		return (super.getSalary());
	}
}
class Labour extends Employee{
	int salary2;
	Labour(){
		super();
		salary2=0;
		
	}
	Labour(String n1, int sal){
		super(n1,sal);
	}
	int getSalary() {
		return(super.getSalary());
	}
}
public class Assignment2_2{
	public static void main(String[] args) {
		Manager m1 = new Manager("Niahrika", 30000);
		Labour m2 = new Labour("None", 20000);
		int m= m1.getSalary()+ m2.getSalary();
		System.out.println(m);
	}

}
	


