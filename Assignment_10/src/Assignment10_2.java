import java.util.*;
interface myInt {
    
    int add(int a, int b);
}

var method1() { return ("Inside Method1"); }
void method2(var a) { System.out.println(a); }
public class Assignment10_2 {
	//var cannot be used in an instance and global variable declaration.
	var x = 50;
	public static void main(String[] args) {
		System.out.println(x);
		
	//var cannot be used as a Generic type.	
		var<var> al = new ArrayList<>();
      al.add(10);
      al.add(20);
      al.add(30);
      System.out.println(al);
      
    //var cannot be used with the generic type.
      var<Integer> a2 = new ArrayList<Integer>();
    a2.add(10);
    a2.add(20);
    a2.add(30);
    System.out.println(a2);
    var list = new ArrayList<String>();
    
   // var cannot be used without explicit initialization.
    var variable;
    var variable = null;
    
   // var cannot be used with Lambda Expression.
    var obj = (a, b) -> (a + b);
    System.out.println(obj.add(2, 3));
    
    
   // var cannot be used for method parameters and return type.
    Demo1 obj = new Demo1();
    var res = obj.method1();
    obj.method2();
    
    
	}

}
