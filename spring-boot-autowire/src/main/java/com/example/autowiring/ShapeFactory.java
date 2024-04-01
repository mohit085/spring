package com.example.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory{
	
	//autowired by type
	@Autowired
	@Qualifier("rectangle")  // shape =  new Rectangle();
	private IShape shape;
	
	
	//autowiring by name
	@Autowired
	private IShape triangle;  // instance variable name same as bean  name
	
	
	
	// autowiring by constructor
	private IShape shaper;
	public ShapeFactory(IShape shaper) {
		super();
		this.shaper=shaper;
	}
	
	public void area(String choice,int x, int y) {
		if(choice.equals("r"))
			shape.area(x,y);
		if(choice.equals("t"))
			triangle.area(x,y);
		if(choice.equals("s"))
			shaper.area(x,y);
		
	}
	
	
}
