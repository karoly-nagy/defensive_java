package com.epam.training.defensive.java.service;

import net.sf.oval.constraint.NotNull;
import net.sf.oval.guard.Guarded;

import com.epam.training.defensive.java.domain.ProcessableItem;
import com.epam.training.defensive.java.interfaces.Processor;

@Guarded
public class DBCProcessor implements Processor {
	
	public ProcessableItem process(@NotNull ProcessableItem item) {
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
