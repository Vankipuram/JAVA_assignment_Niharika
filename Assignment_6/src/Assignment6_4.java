import java.time.LocalDate;
import java.util.*;
public class Assignment6_4 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.parse("2000-09-05");
		
		System.out.println(date.isLeapYear());
		if(date.isLeapYear()==true)
			
		     System.out.println("your date of birth is "+date+" and it was a leap year");
		else
			System.out.println("your date of birth is "+date+" and it was not a leap year");
	}

}
