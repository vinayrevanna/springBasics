package org.vinay.learnspring;

public class Triangle6 implements Shape{

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
	
	@Override
	public String toString() {
		return "Triangle6 [pointA=" + pointA + ", pointB=" + pointB + ", pointC=" + pointC + "]";
	}
	@Override
	public void draw() {
		System.out.println("Drawing Triangle");
		System.out.println("Point A ("+this.pointA.getX()+","+this.pointA.getY()+")");
		System.out.println("Point B ("+this.pointB.getX()+","+this.pointB.getY()+")");
		System.out.println("Point C ("+this.pointC.getX()+","+this.pointC.getY()+")");
		
	}
	
	
}