package org.vinay.learnspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WriteApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		AbstractApplicationContext  context= new ClassPathXmlApplicationContext("spring_6.xml");
		context.registerShutdownHook(); //to get destroy method when @PreDestroy
		//Triangle6 tri =(Triangle6) context.getBean("triangle");
		//System.out.println(tri + " First Bean");
		
		Shape shape = (Shape) context.getBean("circle");  /*coding by interfaces*/ 
		shape.draw();		/*Always used interfaces for di implementation*/
		
	}

}
