package com.mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.dto.Employee;
import com.mongodb.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
	public Employee saveEmployee(Employee emp) {
		return employeeRepository.save(emp);
	}
	
	public List<Employee> getAll(){
		return employeeRepository.findAll();
	}
	
}
