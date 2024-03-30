package com.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.dto.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

}
