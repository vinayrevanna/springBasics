package org.vinay.learnBeansCollections;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.vinay.learnspring.Point;
import org.vinay.learnspring.Shape;

@Component
public class Square  implements Shape, ApplicationEventPublisherAware{

	private Point  midpoint;
	@Autowired
	private MessageSource msg;

	private ApplicationEventPublisher publisher;
	public void draw(){
		System.out.println(this.msg.getMessage("drawing.circle", null, "Default Greeting", null));
		System.out.println(this.msg.getMessage("drawing.point", new Object[]{midpoint.getX(),midpoint.getY()},"Default point greeting",null));// last parameter is used for locale setup in spring docs it is explained ie internationlizartion
		//System.out.println("Point X "+midpoint.getX()+"  Point Y "+midpoint.getY());
		//System.out.println(this.msg.getMessage("greeting", null, "Default Greeting", null));
		DrawEvent drawEvent = new DrawEvent(this);
		publisher.publishEvent(drawEvent);
		
	}

	public Point getMidpoint() {
		return midpoint;
	}

	@Resource(name="point2")
	public void setMidpoint(Point midpoint) {
		this.midpoint = midpoint;
	}

	public MessageSource getMsg() {
		return msg;
	}

	public void setMsg(MessageSource msg) {
		this.msg = msg;
	}
	
	@PostConstruct
	public void initSquare(){
		System.out.println("init square");
	}
	
	@PreDestroy
	public void destroySquare(){
		System.out.println("destroy square");
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		// TODO Auto-generated method stub
		this.publisher = applicationEventPublisher;
	}
}
