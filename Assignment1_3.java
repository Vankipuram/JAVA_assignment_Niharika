import java.util.*;
public class Assignment1_3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int SI,CI,p,r,t,amount,a,b;
		p=sc.nextInt();
		r=sc.nextInt();
		t=sc.nextInt();
		SI=(p*r*t)/100;
		a=r/100;
		b=(1-a)^t;
		amount=p*b;
		CI = amount-p;
		System.out.println("Simple interest  :"+SI);
		
		System.out.println("compound interest: "+CI);
	}

}
