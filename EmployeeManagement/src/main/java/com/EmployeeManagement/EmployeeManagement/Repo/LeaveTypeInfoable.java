package com.EmployeeManagement.EmployeeManagement.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.EmployeeManagement.EmployeeManagement.Model.EmpInfo;
import com.EmployeeManagement.EmployeeManagement.Model.LeaveTypeInfo;

public interface LeaveTypeInfoable extends JpaRepository<LeaveTypeInfo, Integer>{

//	@Query(value="select leave_name from leave_type")
//	public List<LeaveTypeInfo>leavetyp();
}
