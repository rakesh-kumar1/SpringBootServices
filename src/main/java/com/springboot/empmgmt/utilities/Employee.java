package com.springboot.empmgmt.utilities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int employeeId;
	private String employeeName;
	private String employeeDesig;
	private String employeeTechnology;
	
	public Employee() {
		
	}
	
	public Employee(int employeeId, String employeeName, String employeeDesig, String employeeTechnology) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDesig = employeeDesig;
		this.employeeTechnology = employeeTechnology;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public String getEmployeeDesig() {
		return employeeDesig;
	}


	public void setEmployeeDesig(String employeeDesig) {
		this.employeeDesig = employeeDesig;
	}


	public String getEmployeeTechnology() {
		return employeeTechnology;
	}


	public void setEmployeeTechnology(String employeeTechnology) {
		this.employeeTechnology = employeeTechnology;
	}

}