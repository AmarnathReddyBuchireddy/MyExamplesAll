package com.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.entity.Department;
import com.edu.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public List<Department> getAllDepartmentDetails() {
		List<Department> dept = departmentRepository.findAll();
		return dept;
	}

	@Override
	public Department getDepartmentDetails(Long id) {
		Department dept1 = departmentRepository.findById(id).get();
		return dept1;
	}

	@Override
	public Department saveDepartmentDetails(Department department) {
		Department dept = departmentRepository.save(department);
		return dept;
	}

	@Override
	public Department updateDepartmentDetails(Department department) {
		Department department1 = departmentRepository.findById(department.getDepartmentId()).get();
		department1.setDepartmentName(department.getDepartmentName());
		department1.setDepartmentAddress(department.getDepartmentAddress());
		department1.setDepartmentCode(department.getDepartmentCode());
		Department department2 = departmentRepository.save(department1);
		return department2;
	}

	@Override
	public void deleteDepartmentDetails(Long id) {
		 departmentRepository.deleteById(id);
	}
	
	

}
