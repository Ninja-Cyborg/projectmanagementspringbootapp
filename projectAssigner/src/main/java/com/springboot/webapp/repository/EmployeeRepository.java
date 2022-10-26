package com.springboot.webapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.webapp.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>  {

	// search Methods
	
	public List<Employee> findAllByOrderByLastNameAsc();
	
	// search for either field
	public List<Employee> findByFirstNameContainsOrLastNameContainsAllIgnoreCase(String firstname, String lastname);
	
}
