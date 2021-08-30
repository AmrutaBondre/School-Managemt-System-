package com.sms.services;

import com.sms.beans.Student;
import com.sms.beans.Teacher;

public interface SchoolServiceInt {
	public double calculateRevenue();
	public double calculateExpenses();
	
	public void addStudent(Student student);
	public void displayAllStudent();
	public void displayStudentByID(int id);
	
	public void addTeacher(Teacher teacher);
	public void displayAllTeacher();
	public void displayTeacherByID(int id);
	
	

	
}
