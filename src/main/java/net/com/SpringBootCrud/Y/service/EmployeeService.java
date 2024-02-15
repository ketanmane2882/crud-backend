package net.com.SpringBootCrud.Y.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.com.SpringBootCrud.Y.dao.EmployeeDao;
import net.com.SpringBootCrud.Y.entity.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	public EmployeeDao employeeDao;
	
//	-----------------------------------------------------------------------------------------------
	
	public Employee saveEmployee(Employee employee)
	{
		return employeeDao.save(employee);
	}
//	-----------------------------------------------------------------------------------------------
	public List<Employee> getEmployees()
	{
		List<Employee> employees = new ArrayList<>();
		employeeDao.findAll().forEach(employees::add);
		return employees;
	}
//	-----------------------------------------------------------------------------------------------
    public Employee getEmployee(Integer employeeId)
    {
    	return employeeDao.findById(employeeId).orElseThrow();    //.get();
    }
    
//	-----------------------------------------------------------------------------------------------
    public void deleteEmployee(Integer employeeId)
    {
    	employeeDao.deleteById(employeeId);
    }
//	-----------------------------------------------------------------------------------------------
    
    public Employee updateEmployee(Employee employee)
    {
    	employeeDao.findById(employee.getEmployeeId()).orElseThrow();
    	return employeeDao.save(employee);
    }
    
    public Employee updateEmployee(Integer employeeId , Employee employee)
    {
    	 Employee emp = employeeDao.findById(employeeId).get();
    	 emp.setEmployeeName(employee.getEmployeeName());
    	 emp.setEmployeeAddress(employee.getEmployeeAddress());
    	 emp.setEmployeeContactNumber(employee.getEmployeeContactNumber());
    	 emp.setEmployeeAddress(employee.getEmployeeAddress());
    	 emp.setEmployeeGender(employee.getEmployeeGender());
    	 emp.setEmployeeDepartment(employee.getEmployeeDepartment());
    	 emp.setEmployeeSkills(employee.getEmployeeSkills());
//    	 Employee emp1 =employeeDao.save(emp);
//    	 return emp1;
    	 return employeeDao.save(emp);
    	 
    	 
    	 
    	 
    	 
    }
}
