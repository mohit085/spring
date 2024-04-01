package com.voya.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Guitar implements IInstrument{

	@Override
	public void play(String song) {
		System.out.println("playing guitar"+song);
		
	}

}
