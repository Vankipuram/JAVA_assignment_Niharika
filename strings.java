
public class strings {
	public static void main(String[] args) {
		String str="Hello World";
		System.out.println(str.length());
		String str1="Hello ";
		String str2="How are you?";
		System.out.println(str1.concat(str2));
		
		//string pool 
		
		String name="Java String Pool refers to Collection of strings which are stored in heap memory";
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.replace('a', '$'));
		System.out.println(name.contains("Collection"));
		System.out.println(name.contains("java string pool refers to collection of strings which are stored in heap memory"));
		System.out.println(name.equalsIgnoreCase("java string pool refers to collection of strings which are stored in heap memory"));
		
	}
	

}
