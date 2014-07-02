package com.epam.training.defensive.java.service;

import com.epam.training.defensive.java.domain.ProcessableItem;
import com.epam.training.defensive.java.interfaces.Processor;

public class SimpleProcessor implements Processor {

	/**
     * Processes data with less than 10 chars.
     * @return the processed data.
     */
	@Override
	public ProcessableItem process(ProcessableItem item) {
		if (item == null) {
			throw new IllegalArgumentException();
		}

		
		ProcessableItem newItem = null;
        if (item.getData().size() < 10) {
            newItem = doProcessData(item);
        }
        return newItem;
	}

	private ProcessableItem doProcessData(ProcessableItem item) {
		// do something
		return item;
	}

}
