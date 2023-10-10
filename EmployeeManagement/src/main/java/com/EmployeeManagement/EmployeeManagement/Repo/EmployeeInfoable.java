package com.EmployeeManagement.EmployeeManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EmployeeManagement.EmployeeManagement.Model.*;

public interface EmployeeInfoable extends JpaRepository<EmployeeInfo,Integer> {

}
