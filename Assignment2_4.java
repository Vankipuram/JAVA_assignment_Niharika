
abstract class Assignment2_4 {
	public void method1() {
		System.out.println("Hello");
	}
	abstract public void method2();

}
public class Demo extends Assignment2_4{
	public void method2() {
		System.out.println("Abstract method");
	}
	public static void main(String[] args) {
		Assignment2_4 obj = new Assignment2_4();
		obj.method2();
	}
}