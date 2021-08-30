package com.sms.dao;

import java.util.ArrayList;
import java.util.List;

import com.sms.beans.Student;
import com.sms.beans.Teacher;

public class TeacherDaoImpl implements TeacherDaoInt {

	List<Teacher> teacherDB = new ArrayList();

	@Override
	public void addTeacher(Teacher teacher) {
		teacherDB.add(teacher);
		System.out.println("Teacher added successfully");

	}

	@Override
	public List<Teacher> getAllTeacher() {
		return teacherDB;
	}

	@Override
	public Teacher getTeacherByID(int id) {
		Teacher teacher = null;

		for (Teacher obj : teacherDB) {
			if (obj.getId() == id) {
				teacher = obj;
			}
		}
		return teacher;
	}

	/*
	 * @Override public List<Teacher> getAllTeachers() { List<Teacher> teacherList =
	 * new ArrayList();
	 * 
	 * for(int i=1;i<=10;i++) { Teacher teacher1 = new Teacher();
	 * teacherList.add(teacher1); teacher1.setName("Amruta"); teacher1.setId(1);
	 * teacher1.setSalary(10000+Math.random()*10);
	 * 
	 * 
	 * teacherList.add(teacher1); }
	 * 
	 * Teacher teacher2 = new Teacher(); teacher2.setName("Namrata");
	 * teacher2.setId(11); teacher2.setSalary(11000); teacherList.add(teacher2);
	 * 
	 * return teacherList; }
	 * 
	 */

}
