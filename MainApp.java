package Spring_Assignment_5_Resource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {
	      AnnotationConfigApplicationContext context = 
	            new AnnotationConfigApplicationContext(AppConfig.class);
	      
	      BeanOne beanOne = context.getBean(BeanOne.class);
	      beanOne.doSomething();
	      
	      context.close();
	   }

}
