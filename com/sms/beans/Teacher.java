package com.sms.beans;


public class Teacher
{ 
	private String name;
	private int id;
	private double salary;
	
	//using getter setter method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return " [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	
	
	
		
	
}
