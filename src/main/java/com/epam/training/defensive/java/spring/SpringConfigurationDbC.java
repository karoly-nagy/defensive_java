package com.epam.training.defensive.java.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.epam.training.defensive.java.aspects.MyGuard;
import com.epam.training.defensive.java.service.DBCProcessor;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfigurationDbC {

	@Bean
	MyGuard myGuard() {
		return new MyGuard();
	}

	@Bean
	DBCProcessor sProcessor() {
		return new DBCProcessor();
	}

}
