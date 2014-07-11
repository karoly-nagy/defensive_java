package com.epam.training.defensive.java.service;

import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

import com.epam.training.defensive.java.aspects.MyGuard;

public class AOPTestHelper {

	public static <T> T createAOPProxy(T target) {
		AspectJProxyFactory factory = new AspectJProxyFactory(target);
		factory.setProxyTargetClass(true);
		factory.addAspect(new MyGuard());		
		return factory.getProxy();
	}
	
}
