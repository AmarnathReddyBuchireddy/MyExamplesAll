package com.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.entity.Student;
import com.edu.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/getAllStudentDetails")
	public ResponseEntity<List<Student>> getAllStudentDetails() {
		List<Student> students = studentService.getAllStudentDetails();
		return new ResponseEntity<>(students, HttpStatus.ACCEPTED);
	}

	@GetMapping("/student/{id}")
	public ResponseEntity<Student> getStudentDetails(@PathVariable("id") Long id) {
		Student studentid = studentService.getStudentDetails(id);
		return new ResponseEntity<>(studentid, HttpStatus.ACCEPTED);
	}

	@PostMapping("/student")
	public ResponseEntity<Student> saveStudentDetails(@RequestBody Student student) {
		Student studentss = studentService.saveStudentDetails(student);
		return new ResponseEntity<>(studentss, HttpStatus.CREATED);
	}

	@PutMapping("/updateStudentDetails")
	public ResponseEntity<Student> updateStudentDetails(@RequestBody Student student) {
		Student student1 = studentService.updateStudentDetails(student);
		return new ResponseEntity<>(student1, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteStudentDetails(@PathVariable Long id){
		 studentService.deleteStudentDetails(id);
		return new ResponseEntity<String>("Student details successfully deleted",  HttpStatus.OK);
		
	}
}
