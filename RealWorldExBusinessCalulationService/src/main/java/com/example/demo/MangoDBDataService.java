package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MangoDBDataServiceQualifier")
public class MangoDBDataService implements DataService{

	public int[] retriveData() {
		return new int[] {11, 22, 33, 44, 55};
	}
	

}
