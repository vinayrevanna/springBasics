package org.vinay.learnspring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;


public class DisplayNameBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In before Before Initialiazation Bean name is "+beanName);
		return bean;
		
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		System.out.println("In before After Initialiazation Bean name is "+beanName);
		return bean;
	}
	//configuration related code overwrites
}
