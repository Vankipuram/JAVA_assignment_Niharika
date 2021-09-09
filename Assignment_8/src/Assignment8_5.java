import java.util.Collection;  
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Consumer;
public class Assignment8_5 {
	static void print(String consu) {
		System.out.println("hello "+consu);
	}
	static String firstLetterWord(String str)
    {
        String result = "";
 
        // Traverse the string.
        boolean v = true;
        for (int i = 0; i < str.length(); i++)
        {
            // If it is space, set v as true.
            if (str.charAt(i) == ' ')
            {
                v = true;
            }
             
            // Else check if v is true or not.
            // If true, copy character in output
            // string and set v as false.
            else if (str.charAt(i) != ' ' && v == true)
            {
                result += (str.charAt(i));
                v = false;
            }
        }
 
        return result;
    }
 
    // Driver code
    public static void main(String[] args)
    {
    	Consumer<String> consumer1=Assignment8_3::print;
    	consumer1.accept("John");
        String str = "Welcome to CapGemini";
        System.out.println(firstLetterWord(str));
    }
	

}
