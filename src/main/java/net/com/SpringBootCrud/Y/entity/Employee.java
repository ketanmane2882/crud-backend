package net.com.SpringBootCrud.Y.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer employeeId;
	
	private String employeeName;
	
	private String employeeContactNumber;
	
	private String employeeAddress;
	
	private String employeeGender;
	
	private String employeeDepartment;
	
	private String employeeSkills;

	public Employee() {
		super();
	}

	public Employee(String employeeName, String employeeContactNumber, String employeeAddress, String employeeGender,
			String employeeDepartment, String employeeSkills) {
		super();
		this.employeeName = employeeName;
		this.employeeContactNumber = employeeContactNumber;
		this.employeeAddress = employeeAddress;
		this.employeeGender = employeeGender;
		this.employeeDepartment = employeeDepartment;
		this.employeeSkills = employeeSkills;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeContactNumber() {
		return employeeContactNumber;
	}

	public void setEmployeeContactNumber(String employeeContactNumber) {
		this.employeeContactNumber = employeeContactNumber;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public String getEmployeeGender() {
		return employeeGender;
	}

	public void setEmployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}

	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

	public String getEmployeeSkills() {
		return employeeSkills;
	}

	public void setEmployeeSkills(String employeeSkills) {
		this.employeeSkills = employeeSkills;
	}
	
	

}
