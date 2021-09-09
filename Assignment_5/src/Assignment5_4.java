
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.List;


public class Assignment5_4 {
	public void prop1() {
		Map<String,String> myObj1 = new HashMap<String,String>();
		myObj1.put("1", "Hello");
		System.out.println(myObj1);
		Set<String> keySet= myObj1.keySet();
		List<String> keyList=new ArrayList<>(keySet);
        }
	public void prop2() {
		Map<String,String> myObj2 = new HashMap<String,String>();
		myObj2.put("Today is", "new.java.util.Date()");
		System.out.println(myObj2);
		Set<String> keySet= myObj2.keySet();
		List<String> keyList=new ArrayList<>(keySet);
	}
	
	public static void main(String[] args) {
		Assignment5_4 obj = new Assignment5_4();
		obj.prop1();
		obj.prop2();
		
	}

}
