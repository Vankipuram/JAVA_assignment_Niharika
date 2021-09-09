import java.util.*;
public class Assignment1_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter the number ");
		num=sc.nextInt();
		int temp;
		int rem;
		int sum=0;
		temp=num;
		while(temp>0){
			rem=temp%10;
			sum+=rem*rem*rem;
			temp=temp/10;
		}
		if(sum==num) {
			System.out.println("The given number is armstrong number");
			
		}else {
			System.out.println("The given number is not armstrong number");
		}
	}

}
