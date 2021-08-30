package com.sms.services;

import java.util.List;

import com.sms.beans.Student;
import com.sms.beans.Teacher;
import com.sms.dao.StudentDaoImpl;
import com.sms.dao.StudentDaoInt;
import com.sms.dao.TeacherDaoImpl;
import com.sms.dao.TeacherDaoInt;

public class SchoolServiceImpl implements SchoolServiceInt {
	StudentDaoInt studentDao = new StudentDaoImpl();
	TeacherDaoInt teacherDao = new TeacherDaoImpl();

	/** Student Details */
	@Override
	public void addStudent(Student student) {
		studentDao.addStudent(student);

	}

	@Override
	public void displayStudentByID(int id) {
		Student std = studentDao.getStudentByID(id);
		if (std != null) {
			System.out.println(std);
		} else {
			System.out.println("Wrong Student ID");
		}

	}

	@Override
	public void displayAllStudent() {
		List<Student> studentList = studentDao.getAllStudent();
		for (Student std : studentList) {
			System.out.println(std);
		}

	}

	/** Student Details */

	@Override
	public void addTeacher(Teacher teacher) {
		teacherDao.addTeacher(teacher);
	}

	@Override
	public void displayAllTeacher() {
		List<Teacher> teacherList = teacherDao.getAllTeacher();
		for (Teacher teacherObj : teacherList) {
			System.out.println(teacherObj);
		}

	}

	@Override
	public void displayTeacherByID(int id) {
		Teacher obj = teacherDao.getTeacherByID(id);
		if (obj != null) {
			System.out.println(obj);
		} else {
			System.out.println("Wrong Teacher ID");
		}

	}

	
	@Override
	public double calculateRevenue() {
		List<Student> studentList = studentDao.getAllStudent();
		double revenue = 0;
		for (Student student : studentList) {
			revenue = revenue + student.getFeesPaid();
		}

		return revenue;
	}

	@Override
	public double calculateExpenses() {

		List<Teacher> teacherList = teacherDao.getAllTeacher();
		double expenses = 0;
		for (Teacher teacher : teacherList) {
			expenses = expenses + teacher.getSalary();
		}

		return expenses;
	}
	  
	 

}
