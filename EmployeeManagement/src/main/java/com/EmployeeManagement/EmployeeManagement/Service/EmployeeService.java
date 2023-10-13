package com.EmployeeManagement.EmployeeManagement.Service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.EmployeeManagement.EmployeeManagement.Model.*;
import com.EmployeeManagement.EmployeeManagement.Repo.*;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeInfoable empRepo;
	
	@Autowired
	DepartmentInfoable deptRepo;
	
	@Autowired
	EmpInfoable empRepo1;
	
	@Autowired
	LeaveTypeInfoable leavetypeRepo;
	
	public void addEmployee(EmployeeInfo emp)
	{
		empRepo.save(emp);
	}

	public List<DepartmentInfo> getDepartment() {
		return deptRepo.findAll();
	}

	public List<EmpInfo> getEmployee() {
		List<EmpInfo> a= empRepo1.findAll();
		return a;
	}
	
	public List<LeaveTypeInfo> getLeaveType(){
		return leavetypeRepo.findAll();
		}

}
