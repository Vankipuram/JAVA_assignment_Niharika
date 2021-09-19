package Spring_Assignment_9;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import Spring_Assignment_9.Hello_World;

public class Main {
	public static void main(String[] args)
	        throws Exception
	    {
	 
	        // Loading the Spring XML configuration
	        // file into the spring container and
	        // it will create the instance of
	        // the bean as it loads into container
	 
	        ConfigurableApplicationContext cap
	            = new ClassPathXmlApplicationContext(
	                "Assignment_9.xml");
	 
	        // It will close the spring container
	        // and as a result invokes the
	        // destroy() method
	        cap.close();
	    }

}
