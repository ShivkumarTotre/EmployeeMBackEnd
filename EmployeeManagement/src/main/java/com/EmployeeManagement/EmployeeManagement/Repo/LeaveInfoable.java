package com.EmployeeManagement.EmployeeManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EmployeeManagement.EmployeeManagement.Model.LeaveInfo;

public interface LeaveInfoable extends JpaRepository<LeaveInfo, Integer>{

}
