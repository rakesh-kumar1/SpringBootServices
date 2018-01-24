package com.springboot.empmgmt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.empmgmt.utilities.Employee;

@Repository
public interface EmployeeRepository  extends CrudRepository<Employee, Integer> {

	
	

}
