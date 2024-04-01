package com.spring.javabased;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Waiter {
	
	
	//add 3 instances
	
	@Autowired
	@Qualifier("getIndian")
	IFoodMenu iFoodMenu;
	
	
	@Autowired
	IFoodMenu menus;
	
	
	IFoodMenu menuItems;
	public void setMenuItems(IFoodMenu menuItems) {
		this.menuItems = menuItems;
	}





	public List<String> viewMenu(String choice) {
		List<String> menuList = new ArrayList<>();
		
		if(choice.equalsIgnoreCase("in"))
			menuList = iFoodMenu.showItems();
		if(choice.equalsIgnoreCase("it"))
			menuList = menus.showItems();
		if(choice.equalsIgnoreCase("ch"))
			menuList = menuItems.showItems();
		
		return menuList;
	}

}
