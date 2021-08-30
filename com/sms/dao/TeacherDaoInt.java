package com.sms.dao;
import java.util.List;

import com.sms.beans.Teacher;

public interface TeacherDaoInt {
	public void addTeacher(Teacher teacher);
	public List<Teacher> getAllTeacher();
	public Teacher getTeacherByID(int id);
	

}
