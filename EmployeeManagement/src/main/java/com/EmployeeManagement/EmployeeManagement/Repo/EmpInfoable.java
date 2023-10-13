package com.EmployeeManagement.EmployeeManagement.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.EmployeeManagement.EmployeeManagement.Model.EmpInfo;

public interface EmpInfoable extends JpaRepository<EmpInfo, Integer>{

//	@Query(value="select emp_name from department")
//	public List<EmpInfo>empUser();


}
