package Spring.Assignment_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Assignment_1 {
	public static void  main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Assignment_1.xml");
		Address add = (Address)context.getBean("obj");
		System.out.println(add.display());
		
		Customer customer = (Customer)context.getBean("cust");
		customer.displayCust();
		
		Address add1 = (Address)context.getBean("cust1");
		System.out.println(add1.display());
		
		Customer customer1 = (Customer)context.getBean("cust2");
		customer1.displayCust();
		
		
	}

}
