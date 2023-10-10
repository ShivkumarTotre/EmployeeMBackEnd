package com.EmployeeManagement.EmployeeManagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeeManagement.EmployeeManagement.Model.*;
import com.EmployeeManagement.EmployeeManagement.Repo.*;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeInfoable empRepo;
	
	public void addEmployee(EmployeeInfo emp)
	{
		empRepo.save(emp);
	}

}
