package com.springboot.empmgmt.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.empmgmt.repository.EmployeeRepository;
import com.springboot.empmgmt.utilities.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployee(){
		List<Employee> employees = new ArrayList<Employee>();
		employeeRepository.findAll().forEach(employees::add);
		 return employees;
	}
	
	
	public void addEmployee(Employee empl) {
		employeeRepository.save(empl);
	}
	
	
	public Employee getEmployee(int id) {
		return employeeRepository.findOne(id);
	}
	
	public void udpateEmployee(int id, Employee emp) {
		employeeRepository.save(emp);
	}
	
	public void deleteEmployee(int empId) {
		employeeRepository.delete(empId);
	}
		
/*	private List<Employee> employees = new ArrayList<>(Arrays.asList(
				new Employee(1001, "Rakesh Thakur", "Tech Lead", "Java Tech Stack"),
				new Employee(1002, "Vikas", "Tech Lead", "Oracle Tech Stack"),
				new Employee(1003, "Gaurav", "Tech Lead", "UI Tech Stack"),
				new Employee(1004, "Sandeep", "Tech Lead", "Spring Tech Stack"),
				new Employee(1005, "Sandeep", "Tech Lead", "Spring Tech Stack"),
				new Employee(1006, "Ankit", "Tech Lead", "IOT Labs")));
	
	//Get list of all employees
	public List<Employee> getAllEmployee(){
		return employees;
	}
	
	//Get a single employee	
	public Employee getEmployee(int id) {
		return employees.stream().filter(t->t.getEmployeeId()==id).findFirst().get();		
	}
		
	//add new employee
	public void addEmployee(Employee empl) {
		employees.add(empl);
	}
	
	//update an employee
	public void udpateEmployee(int id, Employee emp) {
		
		for(int i=0; i<employees.size();i++) {
			Employee employee = employees.get(i);
			if(employee.getEmployeeId()==id) {
				employees.set(i, emp);
				return;
			}
			
		}
	}
	
	
	//delete and employee
	public void deleteEmployee(int empId) {
		
		for(int i=0; i<employees.size();i++) {
			Employee employee = employees.get(i);
			if(employee.getEmployeeId()==empId) {
				employees.remove(i);
				return;
			}
		}
	
	//	employees.removeIf(t->t.getEmployeeId()==empId);
	
	
	}	*/
	
	
}
