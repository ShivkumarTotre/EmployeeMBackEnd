package com.EmployeeManagement.EmployeeManagement.Controller;

import java.util.HashMap;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeManagement.EmployeeManagement.Model.DepartmentInfo;
import com.EmployeeManagement.EmployeeManagement.Model.EmpInfo;
import com.EmployeeManagement.EmployeeManagement.Model.EmployeeInfo;
import com.EmployeeManagement.EmployeeManagement.Model.LeaveTypeInfo;
import com.EmployeeManagement.EmployeeManagement.Service.EmployeeService;

@RestController

@RequestMapping("/emp")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	@PostMapping("/addEmployee")
	public void addEmploye(@RequestBody EmployeeInfo emp)
	{
		empService.addEmployee(emp);
	}

	

	@PostMapping("/emplist")
	public List<EmpInfo> list1() {

	    List<EmpInfo> empList = empService.getEmployee();
	    System.out.println(empList);

	    return empList;
	}

	
    @GetMapping("/deptlist")
    public List<DepartmentInfo> list() {
    	List<DepartmentInfo> deptList = empService.getDepartment();
        return deptList;
    }
    
    @GetMapping("/leavetypelist")
    public List<LeaveTypeInfo> list2() {
    	List<LeaveTypeInfo> leaveList = empService.getLeaveType();
        return leaveList;
    }
}
