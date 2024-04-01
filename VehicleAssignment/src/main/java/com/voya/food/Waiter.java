package com.voya.food;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Waiter {
	
	
	//add 3 instances
	
	@Autowired
	@Qualifier("chinese")
	IFoodMenu menu;
	
	
	@Autowired
	IFoodMenu indian;
	
	IFoodMenu italian;
	public Waiter(IFoodMenu italian)  {
		super();
		this.italian=italian;
	}
	
	List<String> viewMenu(String choice) {
		List<String> foodmenu = new ArrayList<>();
		
		if(choice.equalsIgnoreCase("c"))
			foodmenu = menu.showItems();
		if(choice.equalsIgnoreCase("in"))
			foodmenu = indian.showItems();
		if(choice.equalsIgnoreCase("it"))
			foodmenu = italian.showItems();
		
		return foodmenu;
	}

}
