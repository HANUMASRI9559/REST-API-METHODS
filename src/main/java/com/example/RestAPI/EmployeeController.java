package com.example.RestAPI;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

	// http://localhost:9099/Get
	@RequestMapping(value = "/Get", method = RequestMethod.GET)
	public String getEmployee(@RequestParam(value = "name", defaultValue = "KMC") String name) {
		return "Employee" + name;
	}

	@PostMapping(value = "/Create")
	public String postEmployee(@RequestBody String name) {
		return "Employee" + name;
	}

	@PutMapping(value = "/Update")
	public String putEmployee(@RequestBody String name) {
		return "Employee" + name;
	}

	@DeleteMapping(value = "/Delete")
	public String deleteEmployee(@RequestBody String name) {
		return "MESSAGE DELETED....";
	}

	private List<Employee> repositry() {
		// TODO Auto-generated method stub
		return null;
	}

}
