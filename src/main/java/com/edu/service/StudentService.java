package com.edu.service;

import java.util.List;

import com.edu.entity.Student;

public interface StudentService {

	List<Student> getAllStudentDetails();

	Student getStudentDetails(Long id);

	Student saveStudentDetails(Student student);

	Student updateStudentDetails(Student student);
	
	void deleteStudentDetails(Long id);

}
