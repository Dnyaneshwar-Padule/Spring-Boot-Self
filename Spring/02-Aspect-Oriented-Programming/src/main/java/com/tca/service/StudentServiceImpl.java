package com.tca.service;

import com.tca.dao.StudentDao;
import com.tca.entities.Student;

public class StudentServiceImpl implements StudentService {

	private StudentDao studentDao;
	
	//Dependency Injection via, setter 
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	@Override
	public void addStudent(Student student) {
		System.out.println("StudentServiceImpl.addStudent()");
		studentDao.addStudent(student);
	}

}
