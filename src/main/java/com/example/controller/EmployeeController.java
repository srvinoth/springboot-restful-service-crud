package com.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;

import javassist.tools.web.BadHttpRequest;

@RestController
@RequestMapping(path = "/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping(path = "/employee")
	public Iterable<Employee> findAll() {
		return employeeRepository.findAll();
	}

	@GetMapping(path = "/employee/{employeeID}")
	public Employee find(@PathVariable("employeeID") int employeeID) {
		return employeeRepository.findByEmployeeID(employeeID);
	}

	@PostMapping(path = "/employee",consumes = "application/json")
	public Employee create(@RequestBody Employee user) {
		return employeeRepository.save(user);
	}

	@DeleteMapping(path = "/employee/{employeeID}")
	public void delete(@PathVariable("employeeID") int employeeID) {
		Employee employee = employeeRepository.findByEmployeeID(employeeID);
		employeeRepository.delete(employee);
	}

	@PutMapping(path = "/employee/{employeeID}")
	public Employee update(@PathVariable("employeeID") int employeeID, @RequestBody Employee employee) throws BadHttpRequest {
		if (employeeRepository.existsByEmployeeID(employeeID)) {
			employee.setEmployeeID(employeeID);
			employee.setDepartmentID(employee.getDepartment());
			return employeeRepository.save(employee);
		} else {
			throw new BadHttpRequest();
		}
	}
}
