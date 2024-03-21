package com.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
