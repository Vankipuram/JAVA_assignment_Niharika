package Spring_Assignment_5_Inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	 ApplicationContext context = 
			    new ClassPathXmlApplicationContext(("inject.xml"));
	 Employee employee = (Employee)context.getBean("employee");

	  if(employee.getAddress()==null){
	   System.out.println("The Employee Name : " + employee.getName());
	   System.out.println("The Employee Age : " + employee.getAge());
	   System.out.println("The Employee Address : " + "is not provided");
	  }
	  else{
	   System.out.println("The Employee Name : " + employee.getName());
	   System.out.println("The Employee Age : " + employee.getAge());
	   System.out.println("The Employee Address : " +   
	     employee.getAddress().getStreet() + " " +
	     employee.getAddress().getCity() + " " +
	     employee.getAddress().getState());
	  }
	 }


}
