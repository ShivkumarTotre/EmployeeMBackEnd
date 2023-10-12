package com.EmployeeManagement.EmployeeManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EmployeeManagement.EmployeeManagement.Model.DepartmentInfo;

public interface DepartmentInfoable extends JpaRepository<DepartmentInfo, Integer> {

}
