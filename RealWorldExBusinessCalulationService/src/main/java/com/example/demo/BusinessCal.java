package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BusinessCal {
	
	private DataService dataService;
	
	public BusinessCal (DataService dataService) {
		super();
		this.dataService = dataService;
	}
	public int findmax() {
		return Arrays.stream(dataService.retriveData()).max().orElse(0);
	}

}
