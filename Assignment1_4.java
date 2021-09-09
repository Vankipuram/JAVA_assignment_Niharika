import java.util.*;
public class Assignment1_4 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int sub1,sub2,sub3;
		sub1=sc.nextInt();
		sub2=sc.nextInt();
		sub3=sc.nextInt();
		if(sub1>60 && sub2>60 && sub3>60) {
			System.out.println("Passesd");
		}else if((sub1 & sub2)>60 || (sub2 & sub3)>60 || (sub3 & sub1)>60){
			System.out.println("Promoted");
		}else {
			System.out.println("Failed");
		}
	}

}
