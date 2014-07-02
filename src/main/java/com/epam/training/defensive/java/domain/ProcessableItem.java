package com.epam.training.defensive.java.domain;

import static com.google.common.collect.Lists.newArrayList;

import java.util.List;

public class ProcessableItem {
	private List<String> data;

		
	public ProcessableItem() {
		super();
		data = newArrayList();
	}


	public List<String> getData() {
		return data;
	}
	
	
}
