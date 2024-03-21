package com.edu.service;

import java.util.List;

import com.edu.entity.Department;

public interface DepartmentService {
	
	List<Department> getAllDepartmentDetails();

	Department getDepartmentDetails(Long id);

	Department saveDepartmentDetails(Department department);

	Department updateDepartmentDetails(Department department);
	
	void deleteDepartmentDetails(Long id);

}
