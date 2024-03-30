package com.mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.dto.Employee;
import com.mongodb.service.EmployeeService;


@RestController
@RequestMapping("/mongodb")
public class MyController {
	@Autowired
	EmployeeService employeeService;
	
	// http://localhost:8080/mongodb/add
	//Json
	// {"id": "Inc 4","firstName": "IshtiyaqueA","lastName": "Ansari","age": 50}

	@PostMapping("add")
	public Employee addEmployee(@RequestBody Employee emp) {

		return employeeService.saveEmployee(emp);
	}
	
	// http://localhost:8080/mongodb/get
	@GetMapping("/get")
	public List<Employee> getAllEmployees(){
		return employeeService.getAll();
	}
	
}
