package Spring_Assignment_8;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
//@ComponentScan(basePackages = "Spring_Assignment_8")
public class AppConfig {
	@Bean(initMethod="init",destroyMethod="destroy")
	   public MailService getMailService() {
	      return new MailService();
	   }

}
