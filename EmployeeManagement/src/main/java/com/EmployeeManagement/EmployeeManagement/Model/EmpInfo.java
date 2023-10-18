package com.EmployeeManagement.EmployeeManagement.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "employee")
@Setter
@Getter
public class EmpInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private int emp_id;

    @Column(name = "emp_name")
    private String ename;

    @Column(name = "email")
    private String email;

    @OneToOne
    @JoinColumn(name = "dept_id")
    private DepartmentInfo departmentInfo;

    @OneToOne
    @JoinColumn(name = "dept_id")
    private DepartmentInfo departmentInfo;		
}
