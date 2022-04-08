package com.example.RestAPI;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.ResponseBody;

//@ResponseBody
@RestController
public class EmpController {

	@GetMapping("/employee")
	public static Employee getEmployee() {
		return new Employee("Hanuamsri","KMC@00023");
	}
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Hanumasri","KMC@00023"));
		employees.add(new Employee("sri","KMC@00025"));
		return employees;
	}
	//http://localhost:9099/employee/sri	
	//PathVariable annotation - we bind request url path variable to method variable
	//@GetMapping("/employee/{name}/{id}")
	//public Employee employeePathVariable(@PathVariable("name") String name, @PathVariable("id") String id) {
		//return new Employee(name,id);
	

		
	}
	

