package com.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.entity.Student;
import com.edu.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudentDetails() {
		List<Student> studentall = studentRepository.findAll();
		return studentall;
	}

	@Override
	public Student getStudentDetails(Long id) {
		Student studentid = studentRepository.findById(id).get();
		return studentid;
	}

	@Override
	public Student saveStudentDetails(Student student) {
		Student student1 = studentRepository.save(student);
		return student1;
	}

	@Override
	public Student updateStudentDetails(Student student) {
		Student student1 = studentRepository.findById(student.getId()).get();
		student1.setName(student.getName());
		student1.setAddress(student.getAddress());
		student1.setDepartment(student.getDepartment());
		Student str = studentRepository.save(student1);

		return str;

	}

	@Override
	public void deleteStudentDetails(Long id) {
		studentRepository.deleteById(id);
	}
	
	

}
