package Spring_Assignment_5_Required;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class BeanOne {
	private BeanTwo beanTwo;

	   @Required
	   public void setBeanTwo(BeanTwo beanTwo) {
	      this.beanTwo = beanTwo;
	   }
	   
	   public void doSomething(){
	      System.out.println("Inside do doSomething() method of BeanOne");
	      beanTwo.doSomething();
	   }

}
