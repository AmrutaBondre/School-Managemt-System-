package com.sms.beans;

public class Student {
	private int id;
	private String name;
	private String grade;
	private double feesPaid;
	private double totalFees;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public double getFeesPaid() {
		return feesPaid;
	}
	public void setFeesPaid(double feesPaid) {
		this.feesPaid = feesPaid;
	}
	public double getTotalFees() {
		return totalFees;
	}
	public void setTotalFees(double totalFees) {
		this.totalFees = totalFees;
	}
	
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", grade=" + grade + ", feesPaid=" + feesPaid + ", totalFees="
				+ totalFees + "]";
	}
	
	
	
	
	
		
	
}
