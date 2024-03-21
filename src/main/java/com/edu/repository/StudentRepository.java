/**
 * 
 */
package com.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
