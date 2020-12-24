package org.vinay.learnspring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource; //jrs 250 annotation

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
//@Repository
//@Service
//@Controller
public class Circle implements Shape {

	private Point center;
	
	@Override
	public void draw() {
		System.out.println("Drawing circle");
		System.out.println("Circel Point is ("+center.getX()+" , "+center.getY()+")");
		
	}

	public Point getCenter() {
		return center;
	}

	
	/*@Required
	public void setCenter(Point center) {
		this.center = center;
	}

	@Autowired
	@Qualifier("CircleRelated")
	public void setCenter(Point center) {
		this.center = center;
		
	}*/
	
	//JSR 250 Annotations
	//@Resource  //checks the bean which has same name as member variable
	@Resource(name="pointC")
	public void setCenter(Point center) {
		this.center = center;
		
	}
	
	@PostConstruct
	public void initCircle(){
		System.out.println("Init of circle");
	}
	
	@PreDestroy
	public void destroyCircle(){
		System.out.println("destroy circle");
	}
}
