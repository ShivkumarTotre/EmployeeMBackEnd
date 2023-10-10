package com.EmployeeManagement.EmployeeManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeManagement.EmployeeManagement.Model.EmployeeInfo;
import com.EmployeeManagement.EmployeeManagement.Service.EmployeeService;

@RestController

@RequestMapping("/emp")
//@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	@PostMapping("/addEmployee")
	public void addEmploye(@RequestBody EmployeeInfo emp)
	{
		empService.addEmployee(emp);
		
	}

}
