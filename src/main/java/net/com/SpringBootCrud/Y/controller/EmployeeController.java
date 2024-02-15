package net.com.SpringBootCrud.Y.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.com.SpringBootCrud.Y.entity.Employee;
import net.com.SpringBootCrud.Y.service.EmployeeService;


@RestController
@CrossOrigin("http://localhost:4200")
public class EmployeeController {
	
	@Autowired
	public EmployeeService employeeService;
	
//	-----------------------------------------------------------------------------------------------

	
//	create post method
	@PostMapping("/save/employee")
	public Employee saveEmployee(@RequestBody Employee employee)
	{
		return employeeService.saveEmployee(employee);
	}
	
//	-----------------------------------------------------------------------------------------------

	//get method
	@GetMapping("/get/employee")
	public List<Employee> getEmployees()
	{
		return employeeService.getEmployees();
	}
	
	@GetMapping("/get/employee/{employeeId}")
	public Employee getEmployees(@PathVariable Integer employeeId)
	{
		return employeeService.getEmployee(employeeId);
	}
//	-----------------------------------------------------------------------------------------------
	@DeleteMapping("/delete/employee/{employeeId}")
	public String deleteEmployee(@PathVariable Integer employeeId)
	{
		employeeService.deleteEmployee(employeeId);
		return "deletion successful";
	}
	
//	-----------------------------------------------------------------------------------------------
	@PutMapping("/update/employee")
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		return employeeService.updateEmployee(employee);
	}
	
	@PutMapping("/update/employee/{employeeId}")
	public Employee updateEmployee(@PathVariable Integer employeeId,@RequestBody Employee employee)
	{
	return employeeService.updateEmployee(employeeId,employee);
	}
}
