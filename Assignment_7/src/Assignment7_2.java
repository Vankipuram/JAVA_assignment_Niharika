import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface info{
	int id();
	String name();
	String Date();
	String Time();
	int Version();
}

class Developer{
	int id;
	String name;
	String Date;
	String Time;
	int Version;
	/*Developer(){
		id=0;
		name=null;
		Date=null;
		Time=null;
		Version=0;
	}*/
	public Developer(int id, String name, String date, String time, int version) {
		super();
		this.id = id;
		this.name = name;
		this.Date = date;
		this.Time = time;
		this.Version = version;
	}
	
	@info(id=10,name="Cap",Date="05/09/2021",Time="10:00",Version=2)
	public int getId() {
		System.out.println(name+" "+Date+" "+Time+" "+Version);
		return id;
	}

	
	}

public class Assignment7_2 {
	public static void main(String[] args) {
	Developer obj = new Developer(10,"Niah","09/08","12:00",2);
		obj.getId();
		
	}

}
