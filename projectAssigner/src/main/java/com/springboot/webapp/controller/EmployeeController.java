package com.springboot.webapp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.webapp.entity.Employee;
import com.springboot.webapp.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService empService) {
		employeeService = empService;
	}
	
	@GetMapping("/list")
	public String listEmployees(Model model) {
		
		List<Employee> employees = employeeService.findAll();
		model.addAttribute("employees", employees);
		
		return "/employees/list-employees";
	}
	
	@GetMapping("/showAddForm")
	public String showAddForm(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		
		return "/employees/employee-form";
	}
	
	@GetMapping("/showUpdateForm")
	public String showUpdateForm(@RequestParam("id") int id, Model model) {
		// find employee from database
		Employee employee = employeeService.findById(id);
		
		model.addAttribute("employee", employee);
		
		return "/employees/employee-form";
	}
	
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		employeeService.save(employee);
		
		return "redirect:/employees/list";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("id") int id) {
		employeeService.deleteById(id);
		
		return "redirect:/employees/list";
	}
	
	@GetMapping("/search")
	public String search(@RequestParam("name") String name, Model model) {
		List<Employee> employees = employeeService.searchBy(name);
		model.addAttribute("employees", employees);
		
		return "/employees/list-employees";
	}
	
}
