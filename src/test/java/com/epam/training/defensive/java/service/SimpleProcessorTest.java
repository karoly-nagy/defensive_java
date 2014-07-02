package com.epam.training.defensive.java.service;

import static com.google.common.collect.Lists.newArrayList;
import static junit.framework.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.epam.training.defensive.java.domain.ProcessableItem;

public class SimpleProcessorTest {
	private static final List<String> TEST_DATA = newArrayList();
	private static final List<String> EXPECTED_DATA = newArrayList();
	
	private SimpleProcessor simpleProcessor;
	
	@Before
	public void setUp() {
		simpleProcessor = new SimpleProcessor();
		// populate LIST_DATA, EXPECTED_DATA...
	}
	
	@Test
	public void testProcess() {
        //given
        ProcessableItem testItem = createProcessableItem();
        //when
        ProcessableItem result = simpleProcessor.process(testItem);
        //then
        assertEquals(result.getData(), EXPECTED_DATA);
    }
	
	private ProcessableItem createProcessableItem() {
		ProcessableItem processableItem = new ProcessableItem();
		processableItem.setData(TEST_DATA);
		return processableItem;
		
	}
}
