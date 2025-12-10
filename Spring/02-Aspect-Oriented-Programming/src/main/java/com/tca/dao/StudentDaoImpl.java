package com.tca.dao;

import com.tca.entities.Student;

public class StudentDaoImpl implements StudentDao{

	@Override
	public void addStudent(Student student) {
		System.out.println(student.getName() + " with roll number :" + student.getId() + " is added !");
	}

}
