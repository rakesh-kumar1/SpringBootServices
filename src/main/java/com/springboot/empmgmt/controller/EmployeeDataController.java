package com.springboot.empmgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.empmgmt.services.EmployeeService;
import com.springboot.empmgmt.utilities.Employee;

@RestController
public class EmployeeDataController {

	@Autowired
	private EmployeeService employeeService;
	
		
	@RequestMapping("/empmgmt/employees")
	public List<Employee> getAllEmployees(){   //This method will return all employees form DB
		return employeeService.getAllEmployee();
	}

		
	@RequestMapping(method=RequestMethod.POST, value="/empmgmt/employees") //add an employee
	public void addNewEmployee(@RequestBody Employee emp) {
		employeeService.addEmployee(emp);
	}
	
	
	@RequestMapping("/empmgmt/employees/{id}")  //single employee will returned
	public Employee getSingleEmployee(@PathVariable int id) {
		return employeeService.getEmployee(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/empmgmt/employees/{id}") //update and existing employee
	public void updateEmployee(@RequestBody Employee emp, @PathVariable int id) {
		employeeService.udpateEmployee(id, emp);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="empmgmt/employees/{id}")
	public void deleteEmployee(@PathVariable int id) {
		employeeService.deleteEmployee(id);
		
	}

}
