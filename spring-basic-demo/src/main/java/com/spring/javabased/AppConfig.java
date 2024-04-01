package com.spring.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration  //spring will create an object for this also
public class AppConfig {
	
	
	// bean deffinitions
	@Bean
	public Chinese getChinese() {
		return new Chinese();
	}
	
	@Bean
	public Indian getIndian() {
		return new Indian();
	}
	
	@Bean
	@Primary
	public Italian getItalian() {
		return new Italian();
	}
	
	@Bean
	Waiter getWaiter() {
		Waiter waiter = new Waiter();
		waiter.setMenuItems(getChinese());
		return waiter;
	}
}
