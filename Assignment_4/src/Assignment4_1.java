import java.util.Scanner;
public class Assignment4_1 {
	
	
		public static void main(String[] args) {
			int num1,num2;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the numbers");
			num1=10;
			num2=sc.nextInt();
			try {
				int result=num1/num2;
				System.out.println("EXception has occured");
			}catch(ArithmeticException ex) {
				System.out.println("Divison by num2 ");
			}
			
			System.out.println("AFter the Exception");
		}

	

}
