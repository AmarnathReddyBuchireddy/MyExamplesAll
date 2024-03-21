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

import com.edu.entity.Department;
import com.edu.service.DepartmentService;

@RestController
@RequestMapping("/api/dept")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@GetMapping("/allDept")
	public ResponseEntity<List<Department>> getAllStudentDetails() {
		List<Department> dept = departmentService.getAllDepartmentDetails();
		return new ResponseEntity<>(dept, HttpStatus.ACCEPTED);
	}

	@GetMapping("/dept/{id}")
	public ResponseEntity<Department> getDepartmentDetails(@PathVariable Long id) {
		Department dept = departmentService.getDepartmentDetails(id);
		return new ResponseEntity<>(dept, HttpStatus.ACCEPTED);
	}

	@PostMapping("/savedept")
	public ResponseEntity<Department> saveDepartmentDetails(@RequestBody Department department) {
		Department dept1 = departmentService.saveDepartmentDetails(department);		
		return new ResponseEntity<>(dept1, HttpStatus.ACCEPTED);		
	}
	
	@PutMapping("/updateDept")
	public ResponseEntity<Department> updateDepartmentDetails(Department department) {
		Department dept1 = departmentService.updateDepartmentDetails(department);
		return new ResponseEntity<>(dept1, HttpStatus.ACCEPTED);		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteDepartmentDetails(@PathVariable Long id){
		departmentService.deleteDepartmentDetails(id);
		return new ResponseEntity<String>("Department details successfully deleted",  HttpStatus.OK);		
	}
}
