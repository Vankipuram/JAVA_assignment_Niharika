package Spring_Assignment_8;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Assignment_8 {
	 public static void main(String[] args) {
	      AnnotationConfigApplicationContext context = 
	            new AnnotationConfigApplicationContext(AppConfig.class);
	      
	      MailService mailService1 = context.getBean(MailService.class);
	      mailService1.send("abcd@example.com");

	      MailService mailService2 = context.getBean(MailService.class);
	      mailService2.send("boraji@example.com");

	      context.close();
	   }

}
