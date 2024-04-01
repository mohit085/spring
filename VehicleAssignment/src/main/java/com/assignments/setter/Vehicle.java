package com.assignments.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
	
	private Integer vehicleId;
	
	private String model;
	
	private String brand;
	
	private String price;
	
	@Autowired
	private Engine engine;

	public Integer getVehicleId() {
		return vehicleId;
	}
	
	@Value("23")
	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getModel() {
		return model;
	}
	
	@Value("scorpio")
	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}
	
	@Value("mahindra")
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPrice() {
		return price;
	}
	
	@Value("250000")
	public void setPrice(String price) {
		this.price = price;
	}

	public Engine getEngine() {
		return engine;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", model=" + model + ", brand=" + brand + ", price=" + price
				+ ", engine=" + engine + "]";
	}
	
	
}
