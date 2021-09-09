
public class Buffer {
	public static void main(String[] args) {
		StringBuilder sc = new StringBuilder();
		sc.append(" Stringbuffer");
		sc.append(" is a peer class of string");
		sc.append(" that provides much of");
		sc.append(" the functionality of strings");
		System.out.println(sc);
		/*sc.append(" it is used to at the specified index position");
		sc.insert(14, " Insert Index ");
		System.out.println(sc);
		*/
		sc.append("This method returns thr reversed object on which it was called");
		System.out.println(sc.reverse());
	}

}
