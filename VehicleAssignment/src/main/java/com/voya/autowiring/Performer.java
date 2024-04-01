package com.voya.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Performer {
	
	// autowired by type
	@Autowired
	@Qualifier("violin") 						// instrument=new Violin();
	private IInstrument instrument;
	
	
	// autowiring by name
	@Autowired 
	private IInstrument guitar;
	
	//autowiring by constructor
	private IInstrument iinstrument;
	public Performer(IInstrument iinstrument) {
		super();
		this.iinstrument=iinstrument;
	}
	
	void playSong(String type,String  song) {
		if(type.equalsIgnoreCase("v"))
			instrument.play(song);
		if(type.equalsIgnoreCase("g"))
			guitar.play(song);
		if(type.equalsIgnoreCase("k"))
			iinstrument.play(song);
			
	}
}

