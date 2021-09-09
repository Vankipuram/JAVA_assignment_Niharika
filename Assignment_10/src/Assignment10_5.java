import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Assignment10_5 {
	public static void main(String[] args) {
		try{
			File text = new File("C:\\Users\\91810\\OneDrive\\data\\price.txt");
		
		if(text.createNewFile()) {
			System.out.println(text.getName());
		    }else {
		    	System.out.println("File existed");
		    }
		}catch(IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		int choice ;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Insert New Price");
		System.out.println("2.View Purchase");
		System.out.println("Enter the choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			String filepath="C:\\Users\\91810\\OneDrive\\data\\price.txt";
			
			int price = sc.nextInt();
			
			System.out.println("Do you want to continue(y/n)? ");
			String s= sc.readLine();
			if(s.equals("no"))
				break;
		case 2:
			int totPrice=0;
			totPrice+=price;
			String filepath1= "C:\\Users\\91810\\OneDrive\\data\\price.txt";
			System.out.println(totPrice);
			break;
		case 3:
			System.out.println("Exit program");
			
			
		}
	}

}
