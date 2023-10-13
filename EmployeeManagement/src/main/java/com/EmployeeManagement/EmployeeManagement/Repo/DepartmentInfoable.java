package com.EmployeeManagement.EmployeeManagement.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.EmployeeManagement.EmployeeManagement.Model.DepartmentInfo;
import com.EmployeeManagement.EmployeeManagement.Model.EmpInfo;

public interface DepartmentInfoable extends JpaRepository<DepartmentInfo, Integer> {

//	@Query(value="select dept_name from department")
//	public List<DepartmentInfo>dept();
}
