package com.spring.javabased;

import java.util.Arrays;
import java.util.List;

public class Chinese implements IFoodMenu{

	@Override
	public List<String> showItems() {
		return Arrays.asList("noodels","soup");
	}
	
}
