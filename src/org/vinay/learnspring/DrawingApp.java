package org.vinay.learnspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		//Triangle1 tri = new Triangle1();
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml")); //BeanFactory is depreciated
		
		
		/*ApplicationContext context= new ClassPathXmlApplicationContext("spring_1.xml");
		Triangle1 tri =(Triangle1) context.getBean("triangle");
		System.out.println(tri + " First Bean");
		Triangle1 tri2 =(Triangle1) context.getBean("triangle");
		System.out.println(tri2 + " Second Bean");
		tri.draw();
		tri2.draw();
		*/
		
		AbstractApplicationContext contxt = new ClassPathXmlApplicationContext("spring.xml");
		contxt.registerShutdownHook(); //only if u register this hook then only destroy method is called
		Triangle trig = (Triangle) contxt.getBean("triangle");
		trig.draw();
		
		
	}
	
}
