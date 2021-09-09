
public class Assignment2_1 {
	private static Assignment2_1 single = null;
	public String var1;
	private Assignment2_1() {
		var1="Hello! welcome to the world";
	}
	public static Assignment2_1 getInstance() {
		if(single == null)
			single = new Assignment2_1();
		return single;
	}

}
class Class2{
	public static void  main(String[] args) {
		Assignment2_1 x = Assignment2_1.getInstance();
		System.out.println(x.hashCode());
	}
}
