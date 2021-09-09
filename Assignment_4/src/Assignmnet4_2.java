import java.util.Scanner;


public class Assignmnet4_2 {
	public static void main(String[] args) {
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		try {
			if(num2==0) {
				throw new UnsupportedOperationException();
			}
			int res=num1/num2;
			System.out.println(res);
		}
		catch(Exception e) {
			System.out.println("Arithmetic Exception");
		}
 }
		
			

}
