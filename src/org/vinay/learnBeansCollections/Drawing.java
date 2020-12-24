package org.vinay.learnBeansCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.vinay.learnspring.Shape;

public class Drawing {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		/*Example for messageSource and internationlization*/
		
		ApplicationContext  context= new ClassPathXmlApplicationContext("spring_mapping.xml");
		Shape sh =(Shape) context.getBean("square");
		sh.draw();
		System.out.println(context.getMessage("greeting", null, "Default Greeting", null));
		
	}
}
