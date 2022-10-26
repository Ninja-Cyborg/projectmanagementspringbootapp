package com.springboot.webapp.service;

import java.util.List;

import com.springboot.webapp.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int id);
	
	public void save(Employee employee);
	
	public void deleteById(int id);
	
	public List<Employee> searchBy(String name);
	
}
