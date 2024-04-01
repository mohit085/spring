package com.spring.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private  String employeeName;
	private Integer employeId;
	
	@Autowired
	private Address address;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String employeeName, Integer employeId) {
		super();
		this.employeeName = employeeName;
		this.employeId = employeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	@Value("Ram")
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Integer getEmployeId() {
		return employeId;
	}
	@Value("10")
	public void setEmployeId(Integer employeId) {
		this.employeId = employeId;
	}
	
	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeId=" + employeId + ", address=" + address + "]";
	}
	
	
}
