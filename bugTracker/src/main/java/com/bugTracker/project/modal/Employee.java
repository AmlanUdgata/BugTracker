package com.bugTracker.project.modal;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String empName;
	private String email;
	private String empContact;
	private long projectId;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String empName, String email, String empContact, long projectId) {
		super();
		this.empName = empName;
		this.email = email;
		this.empContact = empContact;
		this.projectId = projectId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmpContact() {
		return empContact;
	}

	public void setEmpContact(String empContact) {
		this.empContact = empContact;
	}

	public long getProjectId() {
		return projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}

}
