import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Test{
	int value();
}
class hello{
	@Test(value=10)
	public void say() {
		System.out.println("Hello Annotation");
	}
}

public class Assignment7_1 {
	
public static void main(String[] args)throws Exception {
	hello h = new hello();
	Method m = h.getClass().getMethod("hello");
	 Test test = m.getAnnotation(Test.class);
	 System.out.println(test.value());
	
}
}
