import java.util.*;
import java.util.List;
import java.util.ArrayList;
public class Assignment10_3 {
	public static void main(String[] args) {
		List<String> a1 = new ArrayList<String>();
		a1.add("A");
		a1.add("quick");
		a1.add("brown");
		a1.add("fox");
		a1.add("jumps");
		a1.add("over");
		a1.add("the");
		a1.add("lazy");
		a1.add("dog");
		String[] strings = a1.toArray(String[]::new);
		System.out.println(strings);
		
		
	}

}
