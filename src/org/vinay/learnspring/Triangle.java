package org.vinay.learnspring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle  implements InitializingBean,DisposableBean{ 
//public class Triangle {

	private Point pointA;
	private Point pointB;
	private Point pointC;
	
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
		
		System.out.println("Point A ("+this.pointA.getX()+","+this.pointA.getY()+")");
		System.out.println("Point B ("+this.pointB.getX()+","+this.pointB.getY()+")");
		System.out.println("Point C ("+this.pointC.getX()+","+this.pointC.getY()+")");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("init method called before creating bean");
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroy method called just before destroying the bean");
	}
	
	public void myInit(){
		System.out.println("my init method"); //not bound to spring
	}
	
	public void cleanUp(){
		System.out.println("custome destroy method"); //not bound to spring
	}
}
