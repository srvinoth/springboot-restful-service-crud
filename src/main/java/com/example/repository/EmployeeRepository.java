package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String>{
	
	Employee findByEmployeeName(String name);
	
	Employee deleteByEmployeeName(String name);

	Employee findByEmployeeID(int employeeID);

	void deleteByEmployeeID(Employee employeeID);

	boolean existsByEmployeeID(int employeeID);
	

}
