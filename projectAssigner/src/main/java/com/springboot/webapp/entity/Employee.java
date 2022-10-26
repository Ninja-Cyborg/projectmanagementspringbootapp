package com.springboot.webapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="branch")
	private String branch;
	
	@Column(name="project_assigned")
	private String projectAssigned;
	
	public Employee() {
		
	}

	public Employee(int id, String firstName, String lastName, String email, String branch, String projectAssigned) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.branch = branch;
		this.projectAssigned = projectAssigned;
	}

	public Employee(String firstName, String lastName, String email, String branch, String projectAssigned) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.branch = branch;
		this.projectAssigned = projectAssigned;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getProjectAssigned() {
		return projectAssigned;
	}

	public void setProjectAssigned(String projectAssigned) {
		this.projectAssigned = projectAssigned;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", branch=" + branch + ", projectAssigned=" + projectAssigned + "]";
	}
	
}
