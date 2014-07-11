package com.epam.training.defensive.java.service;

import static com.epam.training.defensive.java.service.AOPTestHelper.createAOPProxy;
import static com.google.common.collect.Lists.newArrayList;
import static junit.framework.Assert.assertEquals;

import java.util.List;

import net.sf.oval.exception.ConstraintsViolatedException;

import org.junit.Before;
import org.junit.Test;

import com.epam.training.defensive.java.domain.ProcessableItem;

public class DBCProcessorTest {

	private static final List<String> TEST_DATA = newArrayList();
	private static final List<String> EXPECTED_DATA = newArrayList();
	
	private DBCProcessor underTest;

	@Before
	public void setUp() {
		underTest = createAOPProxy(new DBCProcessor());
				
		// populate LIST_DATA, EXPECTED_DATA...
	}

	@Test
	public void testProcess() {
        //given
        ProcessableItem testItem = createProcessableItem();
        //when
        ProcessableItem result = underTest.process(testItem);
        //then
        assertEquals(result.getData(), EXPECTED_DATA);
    }
	
	@Test (expected = ConstraintsViolatedException.class)
	public void whenProcessCalledWithNullShouldThrowConstraintsViolatedException() {
		underTest.process(null);
	}	

	private ProcessableItem createProcessableItem() {
		ProcessableItem processableItem = new ProcessableItem();
		processableItem.getData().addAll(TEST_DATA);
		return processableItem;
		
	}
	
	
}