package org.vinay.learnspring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle1 implements ApplicationContextAware,BeanNameAware {

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context; 
	
	public Point getPointA() {
		return pointA;
	}


	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}


	public Point getPointB() {
		return pointB;
	}


	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}


	public Point getPointC() {
		return pointC;
	}


	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	

	public void draw(){
	
		System.out.println("Point A ("+this.pointA.getX()+","+this.pointA.getY()+") "+this.pointA.toString());
		System.out.println("Point B ("+this.pointB.getX()+","+this.pointB.getY()+") "+this.pointB.toString());
		System.out.println("Point C ("+this.pointC.getX()+","+this.pointC.getY()+") "+this.pointC.toString());
	}


	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println( "  BEAN NAME IS "+name);
	}


	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.context = applicationContext;
		System.out.println(this.context);
	
	}
	
	
}