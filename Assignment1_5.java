import java.util.*;
public class Assignment1_5 {
	public static void main(String[] args) {
		int slab;
		Scanner sc = new Scanner(System.in);
		slab = sc.nextInt();
		if(slab<180000) {
			System.out.println("Nill");
		}else if (slab<300000) {
			System.out.println("10%");
			
		}else if(slab<500000) {
			System.out.println("20%");
		}
		else if (slab<1000000) {
			System.out.println("30%");
		}
	}

}
