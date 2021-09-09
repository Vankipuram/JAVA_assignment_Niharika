import java.util.*;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Assignment8_3 {
	
	static void print(String consu) {
		System.out.println("hello "+consu);
	}
	
	public  static void main(String[] args) {
		List<String> names =Arrays.asList("Welcome","to","CapGemini");
		Predicate<String> p = (s)->s.startsWith("W");
		for(String st : names) {
			if(p.test(st))
				System.out.println(st);
			}
		Consumer<String> consumer1=Assignment8_3::print;
		consumer1.accept("John");
		
		Supplier<Double> value = () -> Math.random();
        System.out.println(value.get());
		
	}

}
