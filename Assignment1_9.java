import java.util.*;
public class Assignment1_9 {
	public static void main(String[] args) {
		//String Std1,std2,std3;
		int n,sum1=0,sum2=0,sum3=0;
		int sum;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int[] A = new int[n];
		int[] B=new int[n] ;
		int[] C=new int[n];
		for(int i=0;i<n;i++) {
			A[i]=sc.nextInt();
			sum1+=A[i];
		}
		
		for(int j=0;j<n;j++) {
			B[j]=sc.nextInt();
			sum2+=B[j];
		}
		for(int k=0;k<n;k++) {
			C[k]=sc.nextInt();
			sum3+=C[k];
		}
		
		sum=sum1+sum2+sum3;
		System.out.println(sum);
		int avg= sum/9;
		System.out.println(avg);
		
		int std1=sum1;
		int avg1=sum1/3;
		int std2=sum2;
		int avg2=sum2/3;
		int std3=sum3;
		int avg3=sum3/3;
		
		System.out.println(avg1);
		System.out.println(avg2);
		System.out.println(avg3);
	}

}
