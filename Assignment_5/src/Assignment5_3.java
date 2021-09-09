import java.util.ArrayList;
import java.util.Arrays;
public class Assignment5_3 {
	
	public static void swap(Object[] a, int i, int j) {
		Object temp = a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	public static void main(String[] args) {
		
		
		String[] a = {"3","4","7","6","9"};
		swap(a,1,3);
		System.out.println(Arrays.toString(a));
		
		
	}

}
