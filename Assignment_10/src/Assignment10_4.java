import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Assignment10_4 {
	public static void main(String[] args) {
		
		try {
			 File myObj = new File("C:\\Users\\91810\\OneDrive\\data\\Java11Assignments_StudentList");
			 if(myObj.createNewFile()) {
				 System.out.println(myObj.getName());
				 
				 
			 }else {
				 System.out.println("File already exists");
				 
				 Scanner myReader = new Scanner(myObj);
					while(myReader.hasNextLine()) {
						String data = myReader.nextLine();
						System.out.println(data);
						System.out.println(data).Length());
					}
				
					
				 
		} 
			
		}catch(IOException e) {
			System.out.println("Error occured");
			e.printStackTrace();
		}

		/*try {
			File myObj = new File("C:\\Users\\91810\\OneDrive\\data");
			Scanner myReader = new Scanner(myObj);
			while(myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		}catch(FileNotFoundException ex) {
			System.out.println("Error occured");
			ex.printStackTrace();
			
		}*/
		
	}

}
