 abstract class Persistence{
	public abstract void persist();
	
}
class FilePersistence extends Persistence{
	public void persist() {
		System.out.println("Data is being saved in file");
	}
	
}
class DatabasePersistence extends Persistence{
	public void persist() {
		System.out.println("Data has being saved in Database");
	}
}

public class Assignment2_6 {
	public static void main(String[] args) {
		FilePersistence obj1= new FilePersistence();
		DatabasePersistence obj2 = new DatabasePersistence();
		obj1.persist();
		obj2.persist();
		
		
	}

}
