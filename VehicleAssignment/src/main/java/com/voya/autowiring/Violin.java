package com.voya.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Violin implements IInstrument{

	@Override
	public void play(String song) {
		System.out.println("playing violin"+song);
		
	}

}
