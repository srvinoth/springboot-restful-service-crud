package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.entity.Department;
import com.example.repository.DepartmentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	protected CommandLineRunner init(final DepartmentRepository departmentRepository) {

		return args -> {
			Department department1 = new Department();
			department1.setDepartmentID(1);
			department1.setDepartmentName("INFORMATION TECHNOLOGY");
			departmentRepository.save(department1);
			
			Department department2 = new Department();
			department2.setDepartmentID(2);
			department2.setDepartmentName("ACCOUNTING");
			departmentRepository.save(department2);
			
			Department department3 = new Department();
			department3.setDepartmentID(3);
			department3.setDepartmentName("MARCKETING");
			departmentRepository.save(department3);
			
			Department department4 = new Department();
			department4.setDepartmentID(5);
			department4.setDepartmentName("TESTING");
			departmentRepository.save(department4);

		};
	}
}
