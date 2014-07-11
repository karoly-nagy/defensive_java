package com.epam.training.defensive.java.service;

import static com.epam.training.defensive.java.service.AOPTestHelper.createAOPProxy;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;
import java.util.Date;

import net.sf.oval.exception.ConstraintsViolatedException;

import org.junit.Before;
import org.junit.Test;

public class SimpleTransactionTest {

	private SimpleTransaction underTest;

	@Before
	public void setUp() {
		underTest = createAOPProxy(new SimpleTransaction());
				
		// populate LIST_DATA, EXPECTED_DATA...
	}
	
	@Test
	public void whenAddCalledTransactionIdShouldNotBeNull() {
		Date after = new Date(new Date().getTime() + 24 * 60 * 60 * 1000);
		String transactionId = underTest.add(new BigDecimal(100) , "1234567890", after);
		assertNotNull(transactionId);
	}
	
	@Test(expected = ConstraintsViolatedException.class)	
	public void whenAddCalledWithTodayConstraintViolationExceptionShouldThrown() {
		String transactionId = underTest.add(new BigDecimal(100) , "1234567890", new Date());
		assertNotNull(transactionId);
	}
	
}
