# springboot-restful-service-crud
Build Restful CRUD API for a simple CURD application using Spring Boot, Mysql, JPA and Hibernate.

**Create Mysql database**
```bash
create database emp_db
```

## Running the program
To run the application:
```
mvn spring-boot:run
```
## Explore Rest APIs
**Create Employee**
```
Method  	: 	POST
URL		:	http://localhost:8080/api/employee
Header  	:    	Content-Type : application/json
Request		:	{
    			"employeeID": 1,
    			"employeeName": "Vinoth Kumar",
    			"job": "Software Engineer",
    			"salary": 10000,
    			"dob": "10-04-1987",
    			"email": "vinoth@gmail.com",
    			"department": {
        			"departmentID": 1,
        			"departmentName": "INFORMATION TECHNOLOGY"
    			 }
			}
			  
```			  
**Create get all Employee**
```
Method  	: 	GET
URL		:	http://localhost:8080/api/employee
```

**Update Employee**
```
Method  	: 	PUT
URL		:	http://localhost:8080/api/employee/{employeeId}
Header  	:   	Content-Type : application/json
Request		:	{
    			"employeeName": "Vinoth Kumar",
    			"job": "Data Scientist",
    			"salary": 20000,
    			"dob": "10-04-1987",
    			"email": "vinoth@gmail.com",
    			"department": {
        			"departmentID": 1,
    			 }
		     	}
```
**Delete Employee**
```
Method  	: 	DELETE
URL		:	http://localhost:8080/api/employee/{employeeId}
```

**Get Employee by Employee ID**
```
Method  	: 	GET
URL		:	http://localhost:8080/api/employee/{employeeId}
```
