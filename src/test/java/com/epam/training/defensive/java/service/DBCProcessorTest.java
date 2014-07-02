package com.epam.training.defensive.java.service;

import net.sf.oval.exception.ConstraintsViolatedException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.epam.training.defensive.java.spring.SpringConfigurationDbC;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfigurationDbC.class)
public class DBCProcessorTest {

	@Autowired
	private DBCProcessor processor;

	@Test (expected = ConstraintsViolatedException.class)
	public void whenProcessCalledWithNullShouldThrowConstraintsViolatedException() {
		processor.process(null);
	}
	

}


