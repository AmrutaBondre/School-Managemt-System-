package com.sms.dao;

import java.util.List;
import com.sms.beans.Student;

public interface StudentDaoInt {
	
	public void addStudent(Student student);
	public List<Student> getAllStudent();
	public Student getStudentByID(int id);
}
