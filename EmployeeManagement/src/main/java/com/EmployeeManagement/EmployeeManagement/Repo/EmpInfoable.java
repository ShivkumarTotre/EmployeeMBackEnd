package com.EmployeeManagement.EmployeeManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EmployeeManagement.EmployeeManagement.Model.EmpInfo;

public interface EmpInfoable extends JpaRepository<EmpInfo, Integer>{

}
