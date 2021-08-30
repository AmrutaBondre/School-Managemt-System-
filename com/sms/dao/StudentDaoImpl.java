package com.sms.dao;

import java.util.ArrayList;
import java.util.List;

import com.sms.beans.Student;

public class StudentDaoImpl implements StudentDaoInt {
	List<Student> studentsDB = new ArrayList();
	
	@Override
	public void addStudent(Student student) {
		studentsDB.add(student);
		System.out.println("Student added successfully");
		
	}

	@Override
	public List<Student> getAllStudent() {
		return studentsDB;
	}

	@Override
	public Student getStudentByID(int id) {
		Student student = null;
		
		for(Student std:studentsDB) {
			if(std.getId() == id) {
				student = std;
			}
			
		}
		return student;		
	}

	
	

	

	
}
