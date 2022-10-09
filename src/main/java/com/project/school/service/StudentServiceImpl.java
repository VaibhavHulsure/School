package com.project.school.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.school.model.Student;
import com.project.school.repository.StudentRepo;




public class StudentServiceImpl implements StudentService {
    
	@Autowired
	StudentRepo studentrepo;
	
	
	@Override
	public Student saveTheStudent(Student student) {
	  student = studentrepo.save(student);
		return student  ;
	}

}
