package com.epam.training.defensive.java.domain;

import java.util.List;

public class ProcessableItem {
	private List<String> data;

	
	public void setData(List<String> data) {
		this.data = data;
	}


	public List<String> getData() {
		return data;
	}
	
	
}
