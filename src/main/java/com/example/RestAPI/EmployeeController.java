package com.example.RestAPI;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@ResponseBody
@RestController
public class EmployeeController {

	private static final String name = null;

	// http://localhost:9099/name=max
	@RequestMapping(value = "/Get", method = RequestMethod.GET)
	public String Employeedetails(@RequestParam(value = "name", defaultValue = "KMC") String name) {
		return "Employee" + name;
	}

	@RequestMapping(value = "/Create", method = RequestMethod.POST)
	public String Employeedetails1(@RequestBody String name , String id) {
		return "Employee" + name;
	}

	@PutMapping(value = "/Update")
	public String Employeedetails11(@RequestBody String name , String id) {
		return "Employee" + name;
	}

	@DeleteMapping(value = "/Delete")
	public String Employeedetails111(@RequestBody String name, String id) {
		return "MESSAGE DELETED....";
	}

	private List<Employee> repositry() {
		// TODO Auto-generated method stub
		return null;
	}

}
