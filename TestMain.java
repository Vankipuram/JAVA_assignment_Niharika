package com.cap.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		
	    ApplicationContext context = new ClassPathXmlApplicationContext("Question.xml");
		Question q1 = (Question)context.getBean("obj1");
		q1.display1();
		Question q2 = (Question)context.getBean("obj2");
		q2.display2();
		Question q3 = (Question)context.getBean("obj3");
		q3.display3();
		

	}

}
