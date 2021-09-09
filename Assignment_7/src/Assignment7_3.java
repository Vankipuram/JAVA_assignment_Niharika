import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Execute{
	int Sequence();
}

public class Assignment7_3 {
	@Execute(Sequence=2)
		public void myMethod2() {
		System.out.println("This is method_2");
	}
	@Execute(Sequence=1)
	public void myMethod1() {
	System.out.println("This is method_1");
}
	@Execute(Sequence=3)
	public void myMethod3() {
	System.out.println("This is method_3");
}
public static void main(String[] args) {
	Assignment7_3 obj = new Assignment7_3();
	obj.myMethod2();
	obj.myMethod1();
	obj.myMethod3();
}
}
